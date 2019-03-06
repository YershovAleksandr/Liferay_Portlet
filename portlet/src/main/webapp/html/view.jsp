<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/html/init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addRecords" var="addRecordsURL"></portlet:actionURL>

<aui:form action="<%= addRecordsURL %>" name="<portlet:namespace />">
	<aui:fieldset>
		<aui:button-row>
			<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
		</aui:button-row>
	</aui:fieldset>
</aui:form>

<%
	final String STATE_ORDER_BY_COL = "StateOrderByCol";
	final String STATE_ORDER_BY_TYPE = "StateOrderByType";
	final String ASC = "asc";
	final String DESC = "desc";

	String orderByCol = ParamUtil.getString(request, "orderByCol");
	
	String stateOrderByCol = null;
	String stateOrderByType = null;
	
	if (!Validator.isBlank(orderByCol)){
		stateOrderByCol = (String)renderRequest.getPortletSession().getAttribute(STATE_ORDER_BY_COL, PortletSession.PORTLET_SCOPE);
		
		if (orderByCol.equals(stateOrderByCol)){
			stateOrderByType = (String)renderRequest.getPortletSession().getAttribute(STATE_ORDER_BY_TYPE, PortletSession.PORTLET_SCOPE);
			
			if (stateOrderByType.equals(ASC)){
				renderRequest.getPortletSession().setAttribute(STATE_ORDER_BY_TYPE, DESC, PortletSession.PORTLET_SCOPE);
			}else{
				renderRequest.getPortletSession().setAttribute(STATE_ORDER_BY_TYPE, ASC, PortletSession.PORTLET_SCOPE);
			}
		}else{
			renderRequest.getPortletSession().setAttribute(STATE_ORDER_BY_COL, orderByCol, PortletSession.PORTLET_SCOPE);
			renderRequest.getPortletSession().setAttribute(STATE_ORDER_BY_TYPE, ASC, PortletSession.PORTLET_SCOPE);
		}
	}

	stateOrderByCol = (String)renderRequest.getPortletSession().getAttribute(STATE_ORDER_BY_COL, PortletSession.PORTLET_SCOPE);
	stateOrderByType = (String)renderRequest.getPortletSession().getAttribute(STATE_ORDER_BY_TYPE, PortletSession.PORTLET_SCOPE);
%>

<liferay-ui:search-container orderByType="<%=stateOrderByType %>">
	<liferay-ui:search-container-results>
		<%
			int totalRecords = RecordLocalServiceUtil.getRecordsCount();
			
			List<Record> allRecords = RecordLocalServiceUtil.getRecords(scopeGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			List<Record> sortableRecords = new ArrayList<Record>(allRecords);

			if (!Validator.isBlank(stateOrderByCol)){
				BeanComparator comparator = new BeanComparator(stateOrderByCol);
				Collections.sort(sortableRecords, comparator);

				if (stateOrderByType.equalsIgnoreCase(DESC)){
					Collections.reverse(sortableRecords);
				}
			}

			List<Record> recordsPerPage = ListUtil.subList(sortableRecords, searchContainer.getStart(), searchContainer.getEnd());
			
			pageContext.setAttribute("results", recordsPerPage);
			pageContext.setAttribute("total", totalRecords);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.nam.srv42.model.Record" modelVar="record">
		<liferay-ui:search-container-column-text property="name" name="Название вакансии" orderable="true" orderableProperty="name" />
		<liferay-ui:search-container-column-text property="date" name="Дата публикации" orderable="true" orderableProperty="date" />
		<liferay-ui:search-container-column-text property="employer" name="Работодатель" orderable="true"  orderableProperty="employer" />
		<liferay-ui:search-container-column-text property="salary" name="Заработная плата" orderable="true" orderableProperty="salary" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:actionURL name="removeRecords" var="removeRecordsURL"></portlet:actionURL>

<aui:form action="<%= removeRecordsURL %>" name="<portlet:namespace />">
	<aui:fieldset>
		<aui:button-row>
			<aui:button type="submit" value="Очистить базу данных" ></aui:button>
		</aui:button-row>
	</aui:fieldset>
</aui:form>

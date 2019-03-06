<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/html/init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addRecords" var="addRecordsURL"></portlet:actionURL>

<aui:form action="<%= addRecordsURL %>" name="<portlet:namespace />">
	<aui:fieldset>
	<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
	<aui:button type="submit" value="базу данных" ></aui:button>
	<aui:button type="submit" value="данных" ></aui:button>
		<aui:button-row>
			<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
			<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
		</aui:button-row>
	<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
	<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
		
	</aui:fieldset>
</aui:form>

<aui:form action="<%= addRecordsURL %>" name="<portlet:namespace />">
	<aui:fieldset>
	<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
	<aui:button type="submit" value="базу данных" ></aui:button>
	<aui:button type="submit" value="данных" ></aui:button>
	<aui:button type="submit" value="Заполнить базу данных" ></aui:button>
	</aui:fieldset>
</aui:form>

<aui:form action="<%= addRecordsURL %>" name="<portlet:namespace />">
	<aui:fieldset>
	<aui:button type="submit" value="Заполнить" ></aui:button>
	<aui:button type="submit" value="базу" ></aui:button>
	<aui:button type="submit" value="данных" ></aui:button>
	</aui:fieldset>
</aui:form>
<aui:select name="slct" title="title">wtf</aui:select>

<%
	String orderByCol = ParamUtil.getString(request, "orderByCol");
	String orderByType = ParamUtil.getString(request, "orderByType");
	
	System.out.println("orderByCol " + orderByCol);
	System.out.println("orderByType " + orderByType);
	
	String stateOrderByCol = null;
	String stateOrderByType = null;
	
	//if (Validator.isBlank(orderByCol) && Validator.isBlank(orderByType)){
	if (Validator.isBlank(orderByCol)){
		System.out.println("Paginations");
	}else{
		System.out.println("Change sort status");
		
		stateOrderByCol = (String)renderRequest.getPortletSession().getAttribute("StateOrderByCol", PortletSession.PORTLET_SCOPE);
		
		if (stateOrderByCol.equals(orderByCol)){
			stateOrderByType = (String)renderRequest.getPortletSession().getAttribute("StateOrderByType", PortletSession.PORTLET_SCOPE);
			
			if (stateOrderByType.equals("asc")){
				renderRequest.getPortletSession().setAttribute("StateOrderByType", "desc", PortletSession.PORTLET_SCOPE);
			}else{
				renderRequest.getPortletSession().setAttribute("StateOrderByType", "asc", PortletSession.PORTLET_SCOPE);
			}
		}else{
			renderRequest.getPortletSession().setAttribute("StateOrderByCol", orderByCol, PortletSession.PORTLET_SCOPE);
			renderRequest.getPortletSession().setAttribute("StateOrderByType", "asc", PortletSession.PORTLET_SCOPE);
		}
	}
	
	System.out.println("StateOrderByCol = " + (String)renderRequest.getPortletSession().getAttribute("StateOrderByCol", PortletSession.PORTLET_SCOPE));
	System.out.println("StateOrderByType = " + (String)renderRequest.getPortletSession().getAttribute("StateOrderByType", PortletSession.PORTLET_SCOPE));

	stateOrderByCol = (String)renderRequest.getPortletSession().getAttribute("StateOrderByCol", PortletSession.PORTLET_SCOPE);
	stateOrderByType = (String)renderRequest.getPortletSession().getAttribute("StateOrderByType", PortletSession.PORTLET_SCOPE);
	
	/*if (Validator.isBlank(orderByCol)){
		System.out.println("orderByCol blank");
	}else{
		System.out.println("orderByCol !blank");
	}*/

	/*if (Validator.isNull(orderByCol)){
		System.out.println("orderByCol null");
	}else{
		System.out.println("orderByCol !null");
	}*/

	/*if (Validator.isBlank(orderByType)){
		System.out.println("orderByType blank");
	}else{
		System.out.println("orderByType !blank");
	}

	if (Validator.isNull(orderByType)){
		System.out.println("orderByType null");
	}else{
		System.out.println("orderByType !null");
	}*/
	
	
	String sortingOrder = stateOrderByType;
	
	orderByType = stateOrderByType;
	
	/*if (orderByType.equals("desc")){
		orderByType = "asc";
	}else{
		orderByType = "desc";
	}

	if (Validator.isNull(orderByType)){
		orderByType = "desc";
	}*/
	
	State.getInstance().reset2();
	
	
%>

<%-- orderByType="desc" --%>
<liferay-ui:search-container total="<%=RecordLocalServiceUtil.getRecordsCount() %>" orderByType="<%=orderByType %>">
	<%-- liferay-ui:search-container-results results="<%=RecordLocalServiceUtil.getRecords(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>" /--%>
	<liferay-ui:search-container-results>
		<%
			List<Record> allRecords = RecordLocalServiceUtil.getRecords(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			List<Record> recordsPerPage = ListUtil.subList(allRecords, searchContainer.getStart(), searchContainer.getEnd());
			int totalRecords = RecordLocalServiceUtil.getRecordsCount();
			
			List<Record> sortableRecords = new ArrayList<Record>(recordsPerPage);
			//if (Validator.isNotNull(orderByCol)){
				BeanComparator comparator = new BeanComparator(stateOrderByCol);
				
				Collections.sort(sortableRecords, comparator);
				if (sortingOrder.equalsIgnoreCase("asc")){
					
				}else{
					Collections.reverse(sortableRecords);
				}
			//}
			
			pageContext.setAttribute("results", sortableRecords);
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

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
	String orderByCol = ParamUtil.getString(request, "orderByCol");
	String orderByType = ParamUtil.getString(request, "orderByType");
	
	System.out.println("orderByCol " + orderByCol);
	System.out.println("orderByType " + orderByType);
			
	String sortingOrder = orderByType;
	
	if (orderByType.equals("desc")){
		orderByType = "asc";
	}else{
		orderByType = "desc";
	}

	if (Validator.isNull(orderByType)){
		orderByType = "desc";
	}
	
	
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
			if (Validator.isNotNull(orderByCol)){
				BeanComparator comparator = new BeanComparator(orderByCol);
				
				Collections.sort(sortableRecords, comparator);
				if (sortingOrder.equalsIgnoreCase("asc")){
					
				}else{
					Collections.reverse(sortableRecords);
				}
			}
			
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

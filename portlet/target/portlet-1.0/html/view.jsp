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

<liferay-ui:search-container total="<%=RecordLocalServiceUtil.getRecordsCount() %>">
	<liferay-ui:search-container-results results="<%=RecordLocalServiceUtil.getRecords(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>" />

	<liferay-ui:search-container-row className="com.nam.srv42.model.Record" modelVar="record">
		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="date" />
		<liferay-ui:search-container-column-text property="employer" />
		<liferay-ui:search-container-column-text property="salary" />
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

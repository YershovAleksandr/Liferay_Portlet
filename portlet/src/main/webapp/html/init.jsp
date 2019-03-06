<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>
<%@ page import="org.apache.commons.beanutils.BeanComparator" %>

<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>

<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%@ page import="javax.portlet.PortletSession" %>

<%@ page import="com.nam.srv42.model.Record" %>
<%@ page import="com.nam.srv42.service.RecordLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />

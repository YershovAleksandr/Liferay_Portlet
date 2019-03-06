<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page import="org.apache.commons.beanutils.BeanComparator" %>
<%@ page import="java.util.ArrayList" %>

<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil" %>

<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>

<%@ page import="javax.portlet.PortletSession" %>

<%@ page import="com.nam.srv42.model.Record" %>
<%@ page import="com.nam.srv42.service.RecordLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />

<%@ page import="fields.one.to.many.Order" %>
<g:select name="${property}" value="${value}" from="${Order.list()}" optionKey="id" optionValue="customer"/>

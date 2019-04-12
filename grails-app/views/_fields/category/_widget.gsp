<%@ page import="fields.one.to.many.Category" %>
<g:select name="${property}" value="${value}" from="${Category.list()}" optionKey="id" optionValue="name"/>

<#include "head.ftl">
<#include "header.ftl">
<h1> Login Form </h1>
<form action="/login/process/" method="post">
    <table>
        <tr>
            <td>
                <label>Email: </label>
            </td>
            <td>
                <input type="email" name="username" value="${email}"/> <br/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Password: </label>
            </td>
            <td>
                <input type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Log In"/>
            </td>
        </tr>
    </table>
</form>
<#include "footer.ftl">

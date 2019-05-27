<h1> Registration Form </h1>
<form action="/register/process/" method="post">
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
                <label>First Name: </label>
            </td>
            <td>
                <input type="text" name="firstName"/> <br/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Last Name: </label>
            </td>
            <td>
                <input type="text" name="lastName"/> <br/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Class Code: </label>
            </td>
            <td>
                <input type="text" name="classCode"/> <br/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Class Key: </label>
            </td>
            <td>
                <input type="text" name="classKey"/> <br/>
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
                <label>Confirm Password: </label>
            </td>
            <td>
                <input type="password" name="verify"/>
            </td>
        </tr>
        <tr>
            <td>
                <div class="g-recaptcha" data-sitekey="6LeRPm0UAAAAAGKMTS6xq1MtCgh_KBtPLisCkdx6"></div>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Log In"/>
            </td>
        </tr>
    </table>
</form>
package com.example.junittestnew;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void TestRegistFirst() {
        String login = "Login";
        String password = "Пароль";
        User user = new User(login,password);
        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }
    @Test
    public void TestRegistsecond() {
        String login = "";
        String password = "";
        User user = new User(login,password);
        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }
    @Test
    public void TestRegistThree() {
        String login = "gerak1l1211@mail.ru";
        String password = "СлабыйПароль";
        User user = new User(login,password);
        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }

    @Test
    public void TestRegistFour() {
        String login = "gerakl1211@mail.ru";
        String password = "Password1!";
        User user = new User(login,password);
        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }


}
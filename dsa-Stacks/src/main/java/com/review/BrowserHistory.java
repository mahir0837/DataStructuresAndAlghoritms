package com.review;

import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.Deque;


public class BrowserHistory {
    //    Deque<String> stack=new ArrayDeque<>();
    Deque<String> history, forward;
    String currentPage;


    // declare stacks and current

    public BrowserHistory(String homepage) {
        // initialize stacks and current=homepage
        history = new ArrayDeque<>();
        forward = new ArrayDeque<>();
        currentPage = homepage;
    }

    public void visit(String url) {
        // Push 'current' in 'history' stack and mark 'url' as 'current'.
        history.push(currentPage);
        currentPage = url;
        System.out.println(url + " is visited");
        //After a visit operation we need to delete all entries from 'forward' stack.
        forward = new ArrayDeque<>();
    }

    public String back(int steps) {
        // Pop elements from 'history' stack, and push elements in 'forward' stack.
        int steps2 = steps;
        while (steps > 0 && !history.isEmpty()) {
            forward.push(currentPage);
            currentPage = history.pop();
            steps--;
        }
        System.out.println("Back operation of " + steps2 + " brings " + currentPage);
        return currentPage;
    }

    public String forward(int steps) {
        // Pop elements from 'forward' stack, and push elements in 'history' stack.
        int steps2 = steps;
        while (steps > 0 && !forward.isEmpty()) {
            history.push(currentPage);
            currentPage = forward.pop();
            steps--;
        }
        System.out.println("Forward operation of " + steps2 + " brings " + currentPage);
        return currentPage;
    }

}

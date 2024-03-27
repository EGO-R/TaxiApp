package org.mirea;

import org.mirea.utils.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        closing();
    }

    private static void closing() {
        ConnectionManager.closePool();
    }
}

package org.mirea;

import org.mirea.utils.ConnectionManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConnectionManager.closePool();
    }
}

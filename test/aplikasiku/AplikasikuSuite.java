/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasiku;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Syahril
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({aplikasiku.frmutamaTest.class, aplikasiku.frmpembayaranTest.class, aplikasiku.frmpelangganTest.class, aplikasiku.panelgambarTest.class, aplikasiku.frmbookingTest.class, aplikasiku.AplikasikuTest.class})
public class AplikasikuSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

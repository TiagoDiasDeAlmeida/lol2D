package lol.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ASCIIBattlefieldBuilderTest {

	@BeforeEach
	Battlefield.GroundTile[][] ground = buildGround();

    @Test
	private Battlefield.GroundTile[][] testBuildGround() {
    	ground = new Battlefield.GroundTile[groundASCIIMap.length][groundASCIIMap[0].length];
   		y==2;
   		x==3
    	assertEquals(ground[y][x],Battlefield.GroundTile.fromASCII(groundASCIIMap[2][3]));
    
    }
    @Test
    private static char[][] loadMapFile(String mapFilename) {
    	data == "Play";
    	ArrayList<String> rows = new ArrayList<>();
    	assertEquals(rowssize(),0);
    	assertTrue(rows.isEmpty());
    	rows.clear();
    	assertEquals(rows.size(), 0);
    	rows.add("Play");
    	assertEquals(rows.toString(, "Play"));
    }

    @Test 
    private void testInitDestructibleTile(char destructibleASCII, int x,int y){
        boolean placeAt;
        case == B;
        battlefield.placeAt(battlefield.nexusOf(Nexus.BLUE),x,y);
        assertTrue("Impossible to place the nexus on this Groundtile");
        case == R;
        battlefield.placeAt(battlefield.nexusOf(Nexus.RED),x,y);
        assertTrue("Impossible to place the nexus on this Groundtile");

    }  

    @Test	
    private void testVerifyMap(){
        groundASCIIMap.length == destructibleASCIIMap.length; 
        assertFalse("They do not have the same size");
        groundASCIIMap.length > 0 && groundASCIIMap[0].length > 0; 
        assertTrue("Dimensions are greater than zero");
        int height = groundASCIIMap[0].length;
        for(int i = 0; i < groundASCIIMap.length; ++i) {
        groundASCIIMap[i].length == destructibleASCIIMap[i].length;
        AssertFalse("They do not have the same size");
        groundASCIIMap[i].length == height 
        assertFalse("The maps must be rectangle (all rows must have the same length).");
        }
        
    }   
}
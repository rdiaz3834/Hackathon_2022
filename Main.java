import java.util.ArrayList;
public class Main {

	ArrayList<Block> blockchain = new ArrayList<>();
	public static void main(String [] args) {
		String [] genesisTransactions = {"Fee"};
		Block genesisBlock = new Block(	0, genesisTransactions);
		
		String[] block2Transactions = {"Hey my fight money"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		String[] block3Transactions = {"Grandma paycheck"};
		Block block3 = new Block(block2.getBlockHash(), block3Transactions);
		
		System.out.println("Hash of genesis Block: ");
		System.out.println(genesisBlock.getBlockHash());
		
		System.out.println("Hash of Block 2:");
		System.out.println(block2.getBlockHash());
	
		System.out.println("Hash of Block 3:");
		System.out.println(block3.getBlockHash());
	}
}

package Graph;

public class Graph {

	private vertex vertexlist[];
	private int max_vertex=20;
	private int n_vertex;
	private int adjmat[][];
//	int StackUsingArray st=new StackUsingArray() ;
	
	public  Graph()
	{
	 
		vertexlist=new vertex[max_vertex];
		n_vertex=0;
		adjmat=new int [max_vertex][max_vertex];
		for(int i=0;i<max_vertex;i++) {
			for(int j=0;j<max_vertex;j++) {
				adjmat[i][j]=0;
			}
		}
		
	}
	
	public void addVertex(char lab) 
	{
		vertexlist[n_vertex++]=new vertex(lab);
	}
	public void addEdge(int start ,int end) {
		adjmat[start][end]=1;
		adjmat[end][start]=1;
		
	}
	public void display(int v) 
	{
		System.out.println(vertexlist[v].label);
	}
	public int getAdjUnvisitedVertex(int v)
	{
	for(int j=0; j<n_vertex; j++)
	if(adjmat[v][j]==1 && vertexlist[j].IsVisited==false)
	return j; // return first such vertex
	return -1; // no such vertices
	}
	public void dfs() 
	{
		vertexlist[0].IsVisited=true;
		display(0);
		
		
	}
}

package St_Rose;

public class Int_Node
{
	private int data;
	private Int_Node link;
	
	
	public Int_Node()
	{
		link=null;
		data=0;
		//count=0;
			
	}
	
	public Int_Node(int data,Int_Node link)
	{
			this.data = data;
			this.link = link;
	}

	public int getData() 
	{
		return data;
	}


	public void setData(int data)
	{
		this.data = data;
	}


	public Int_Node getLink() 
	{
		return link;
	}


	public void setLink(Int_Node link)
	{
		this.link = link;
	}
	
}

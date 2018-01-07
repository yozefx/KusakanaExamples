package com.kusakana.exercise001.scenes;
import com.kusakana.exercise001.KuMasterScene;
import com.kusakana.exercise001.regions.LvlReg;
import com.negrorevolutio.nereengine.Kusakana;
public class WorldScn extends KuMasterScene
{
	protected LvlReg Lvl0;
	public WorldScn(Kusakana Game)
	{
		super(Game);
		if(this.UnAutorized != null)
		{
			this.DeclareUnAuthorizedAmount(1);
		}
		this.Lvl0= new LvlReg(this);
		this.Lvl0.X= 0;
		this.Lvl0.Y= 0;
		this.AddRegionToScene(this.Lvl0);
		this.Lvl0.AfterCreation();
		this.UseDefault();
		this.Red= 0/255.0f;
		this.Green= 0/255.0f;
		this.Blue= 0/255.0f;
		this.Name= "World";
	}
}

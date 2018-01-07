package com.kusakana.exercise001.regions;
import com.kusakana.exercise001.objects.ShipObj;
import com.kusakana.exercise001.KuMasterRegion;

import com.negrorevolutio.nereengine.asm.scenes.KuASMScene;
public class LvlReg extends KuMasterRegion
{
	protected ShipObj Ship0;
	public LvlReg(KuASMScene Scene)
	{
		super(Scene);
		this.Kind= "Lvl";
		this.X = 0;
		this.Y = 0;
		this.Width = 800;
		this.Height = 480;
		this.SetAppearance();
		this.Ship0= new ShipObj(this);
		this.Ship0.X= 364f;
		this.Ship0.Y= 208f;
		this.Ship0.Width= 40f;
		this.Ship0.Height= 40f;
		this.Ship0.Name= "636508984540267999";
		this.Ship0.Zindex= 0;
		this.AddObjectToRegion(this.Ship0);
		Kid.Eyes.Target = Ship0;
	}

	@Override
	public void Dispose()
	{
		super.Dispose();
		this.Ship0= null;
	}
}

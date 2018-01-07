package com.kusakana.exercise003.assets;
import com.negrorevolutio.nereengine.KuAsset;
import com.negrorevolutio.nereengine.asm.KuResource;
public class KuGlobal extends KuAsset
{
	public KuResource coin01;
	public KuResource ShipAst;

	public KuGlobal(){ super(); }

	public void Createcoin01(){
		coin01 = InstanceCreate( new KuResource(), "sound", "coin01", "sounds/coin01.wav"); 
	}
	public void Destroycoin01(){
		InstanceDestroy("coin01");
		coin01 = null;
	}

	public void CreateShipAst(){
		ShipAst = InstanceCreate( new KuResource(), "texture", "ShipAst", "images/ShipAst.png"); 
	}
	public void DestroyShipAst(){
		InstanceDestroy("ShipAst");
		ShipAst = null;
	}

	@Override
	public void Dispose() { 
		Destroycoin01();
		DestroyShipAst();
		super.Dispose();
	}
}

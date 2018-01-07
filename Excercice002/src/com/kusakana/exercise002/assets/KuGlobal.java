package com.kusakana.exercise002.assets;
import com.negrorevolutio.nereengine.KuAsset;
import com.negrorevolutio.nereengine.asm.KuResource;
public class KuGlobal extends KuAsset
{
	public KuResource ShipAst;

	public KuGlobal(){ super(); }

	public void CreateShipAst(){
		ShipAst = InstanceCreate( new KuResource(), "texture", "ShipAst", "images/ShipAst.png"); 
	}
	public void DestroyShipAst(){
		InstanceDestroy("ShipAst");
		ShipAst = null;
	}

	@Override
	public void Dispose() { 
		DestroyShipAst();
		super.Dispose();
	}
}

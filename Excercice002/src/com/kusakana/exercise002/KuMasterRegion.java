package com.kusakana.exercise002;

import com.kusakana.exercise002.objects.ShipObj;
import com.kusakana.exercise002.objects.BlockObj;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.scenes.KuASMRegion;
import com.negrorevolutio.nereengine.asm.scenes.KuASMScene;
public abstract class KuMasterRegion extends KuASMRegion
{
	public KuMasterRegion(KuASMScene Scene)
	{
		super(Scene);
	}

	@Override
	protected KuASMObject WhichObject(String Kind)
	{
		KuASMObject Obj = null;
		if(Kind == "Ship"){
			Obj = new ShipObj(this);
		}
		else if(Kind == "Block"){
			Obj = new BlockObj(this);
		}
		return Obj;
	}
}

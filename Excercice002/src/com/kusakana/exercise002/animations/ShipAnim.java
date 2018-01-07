package com.kusakana.exercise002.animations;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.kusakana.exercise002.assets.KuGlobal;
import com.negrorevolutio.nereengine.KuAsset;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.sprites.KuASMAnimation;
import com.negrorevolutio.nereengine.asm.sprites.KuASMSprite;
public class ShipAnim extends KuASMAnimation
{
	public ShipAnim(KuASMObject Parent) {
		super(Parent);
	}

	public class ShipSpr extends KuASMSprite
	{
		public ShipSpr(KuAsset asset){
			super(asset);
		}
	}

	@Override
	public void Creation()
	{
		Count = 1;
		this.WaitFrames = new float[Count];
		for(int i = 0;  i< Count; ++i)
		{
			ShipSpr Spr = new ShipSpr(Asset);
			TextureRegion Reg =  ((KuGlobal)Asset).ShipAst.Region;
			String n = ((KuGlobal)Asset).ShipAst.Name;
			switch(i)
			{
			case 0:Spr.Init(Reg, n, 1, 0, 0.1f, 40, 40);break;
			}
			Frames.add(Spr);
			WaitFrames[i] = Spr.Wait;
		}
	}
}

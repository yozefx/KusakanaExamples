package com.kusakana.exercise003.animations;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.kusakana.exercise003.assets.KuGlobal;
import com.negrorevolutio.nereengine.KuAsset;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.sprites.KuASMAnimation;
import com.negrorevolutio.nereengine.asm.sprites.KuASMSprite;
public class DiamondAnim extends KuASMAnimation
{
	public DiamondAnim(KuASMObject Parent) {
		super(Parent);
	}

	public class DiamondSpr extends KuASMSprite
	{
		public DiamondSpr(KuAsset asset){
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
			DiamondSpr Spr = new DiamondSpr(Asset);
			TextureRegion Reg =  ((KuGlobal)Asset).ShipAst.Region;
			String n = ((KuGlobal)Asset).ShipAst.Name;
			switch(i)
			{
			case 0:Spr.Init(Reg, n, 85, 2, 0.1f, 40, 40);break;
			}
			Frames.add(Spr);
			WaitFrames[i] = Spr.Wait;
		}
	}
}

package com.kusakana.exercise003.animations;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.kusakana.exercise003.assets.KuGlobal;
import com.negrorevolutio.nereengine.KuAsset;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.sprites.KuASMAnimation;
import com.negrorevolutio.nereengine.asm.sprites.KuASMSprite;
public class BlockAnim extends KuASMAnimation
{
	public BlockAnim(KuASMObject Parent) {
		super(Parent);
	}

	public class BlockSpr extends KuASMSprite
	{
		public BlockSpr(KuAsset asset){
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
			BlockSpr Spr = new BlockSpr(Asset);
			TextureRegion Reg =  ((KuGlobal)Asset).ShipAst.Region;
			String n = ((KuGlobal)Asset).ShipAst.Name;
			switch(i)
			{
			case 0:Spr.Init(Reg, n, 43, 1, 0.1f, 40, 40);break;
			}
			Frames.add(Spr);
			WaitFrames[i] = Spr.Wait;
		}
	}
}

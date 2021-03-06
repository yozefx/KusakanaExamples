package com.kusakana.exercise003.regions;
import com.kusakana.exercise003.objects.ShipObj;
import com.kusakana.exercise003.objects.BlockObj;
import com.kusakana.exercise003.objects.DiamondObj;
import com.kusakana.exercise003.KuMasterRegion;

import com.negrorevolutio.nereengine.asm.scenes.KuASMScene;
public class LvlReg extends KuMasterRegion
{
	protected ShipObj Ship0;
	protected BlockObj Block1;
	protected BlockObj Block2;
	protected BlockObj Block3;
	protected BlockObj Block4;
	protected BlockObj Block5;
	protected BlockObj Block6;
	protected BlockObj Block7;
	protected BlockObj Block8;
	protected BlockObj Block9;
	protected BlockObj Block10;
	protected BlockObj Block11;
	protected BlockObj Block12;
	protected BlockObj Block13;
	protected BlockObj Block14;
	protected BlockObj Block15;
	protected BlockObj Block16;
	protected BlockObj Block17;
	protected BlockObj Block18;
	protected BlockObj Block19;
	protected BlockObj Block20;
	protected BlockObj Block21;
	protected BlockObj Block22;
	protected DiamondObj Diamond23;
	protected DiamondObj Diamond24;
	protected DiamondObj Diamond25;
	protected DiamondObj Diamond26;
	protected DiamondObj Diamond27;
	protected DiamondObj Diamond28;
	protected DiamondObj Diamond29;
	protected DiamondObj Diamond30;
	protected DiamondObj Diamond31;
	protected DiamondObj Diamond32;
	protected DiamondObj Diamond33;
	protected DiamondObj Diamond34;
	protected DiamondObj Diamond35;
	protected DiamondObj Diamond36;
	protected DiamondObj Diamond37;
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
		this.Block1= new BlockObj(this);
		this.Block1.X= 215f;
		this.Block1.Y= 131f;
		this.Block1.Width= 40f;
		this.Block1.Height= 40f;
		this.Block1.Name= "636508994162408354";
		this.Block1.Zindex= 0;
		this.AddObjectToRegion(this.Block1);
		this.Block2= new BlockObj(this);
		this.Block2.X= 215f;
		this.Block2.Y= 172f;
		this.Block2.Width= 40f;
		this.Block2.Height= 40f;
		this.Block2.Name= "636508994185289663";
		this.Block2.Zindex= 0;
		this.AddObjectToRegion(this.Block2);
		this.Block3= new BlockObj(this);
		this.Block3.X= 214f;
		this.Block3.Y= 213f;
		this.Block3.Width= 40f;
		this.Block3.Height= 40f;
		this.Block3.Name= "636508994226642028";
		this.Block3.Zindex= 0;
		this.AddObjectToRegion(this.Block3);
		this.Block4= new BlockObj(this);
		this.Block4.X= 215f;
		this.Block4.Y= 254f;
		this.Block4.Width= 40f;
		this.Block4.Height= 40f;
		this.Block4.Name= "636508994253623571";
		this.Block4.Zindex= 0;
		this.AddObjectToRegion(this.Block4);
		this.Block5= new BlockObj(this);
		this.Block5.X= 216f;
		this.Block5.Y= 293f;
		this.Block5.Width= 40f;
		this.Block5.Height= 40f;
		this.Block5.Name= "636508994278024967";
		this.Block5.Zindex= 0;
		this.AddObjectToRegion(this.Block5);
		this.Block6= new BlockObj(this);
		this.Block6.X= 256f;
		this.Block6.Y= 292f;
		this.Block6.Width= 40f;
		this.Block6.Height= 40f;
		this.Block6.Name= "636508994299136174";
		this.Block6.Zindex= 0;
		this.AddObjectToRegion(this.Block6);
		this.Block7= new BlockObj(this);
		this.Block7.X= 296f;
		this.Block7.Y= 292f;
		this.Block7.Width= 40f;
		this.Block7.Height= 40f;
		this.Block7.Name= "636508994325537685";
		this.Block7.Zindex= 0;
		this.AddObjectToRegion(this.Block7);
		this.Block8= new BlockObj(this);
		this.Block8.X= 334f;
		this.Block8.Y= 290f;
		this.Block8.Width= 40f;
		this.Block8.Height= 40f;
		this.Block8.Name= "636508994342178636";
		this.Block8.Zindex= 0;
		this.AddObjectToRegion(this.Block8);
		this.Block9= new BlockObj(this);
		this.Block9.X= 373f;
		this.Block9.Y= 288f;
		this.Block9.Width= 40f;
		this.Block9.Height= 40f;
		this.Block9.Name= "636508994361929766";
		this.Block9.Zindex= 0;
		this.AddObjectToRegion(this.Block9);
		this.Block10= new BlockObj(this);
		this.Block10.X= 413f;
		this.Block10.Y= 287f;
		this.Block10.Width= 40f;
		this.Block10.Height= 40f;
		this.Block10.Name= "636508994395231671";
		this.Block10.Zindex= 0;
		this.AddObjectToRegion(this.Block10);
		this.Block11= new BlockObj(this);
		this.Block11.X= 454f;
		this.Block11.Y= 286f;
		this.Block11.Width= 40f;
		this.Block11.Height= 40f;
		this.Block11.Name= "636508994474806222";
		this.Block11.Zindex= 0;
		this.AddObjectToRegion(this.Block11);
		this.Block12= new BlockObj(this);
		this.Block12.X= 497f;
		this.Block12.Y= 284f;
		this.Block12.Width= 40f;
		this.Block12.Height= 40f;
		this.Block12.Name= "636508994491047151";
		this.Block12.Zindex= 0;
		this.AddObjectToRegion(this.Block12);
		this.Block13= new BlockObj(this);
		this.Block13.X= 536f;
		this.Block13.Y= 284f;
		this.Block13.Width= 40f;
		this.Block13.Height= 40f;
		this.Block13.Name= "636508994510728277";
		this.Block13.Zindex= 0;
		this.AddObjectToRegion(this.Block13);
		this.Block14= new BlockObj(this);
		this.Block14.X= 534f;
		this.Block14.Y= 246f;
		this.Block14.Width= 40f;
		this.Block14.Height= 40f;
		this.Block14.Name= "636508994537839828";
		this.Block14.Zindex= 0;
		this.AddObjectToRegion(this.Block14);
		this.Block15= new BlockObj(this);
		this.Block15.X= 532f;
		this.Block15.Y= 206f;
		this.Block15.Width= 40f;
		this.Block15.Height= 40f;
		this.Block15.Name= "636508994713159855";
		this.Block15.Zindex= 0;
		this.AddObjectToRegion(this.Block15);
		this.Block16= new BlockObj(this);
		this.Block16.X= 531f;
		this.Block16.Y= 164f;
		this.Block16.Width= 40f;
		this.Block16.Height= 40f;
		this.Block16.Name= "636508994735051107";
		this.Block16.Zindex= 0;
		this.AddObjectToRegion(this.Block16);
		this.Block17= new BlockObj(this);
		this.Block17.X= 531f;
		this.Block17.Y= 125f;
		this.Block17.Width= 40f;
		this.Block17.Height= 40f;
		this.Block17.Name= "636508994761062595";
		this.Block17.Zindex= 0;
		this.AddObjectToRegion(this.Block17);
		this.Block18= new BlockObj(this);
		this.Block18.X= 257f;
		this.Block18.Y= 132f;
		this.Block18.Width= 40f;
		this.Block18.Height= 40f;
		this.Block18.Name= "636508994805205120";
		this.Block18.Zindex= 0;
		this.AddObjectToRegion(this.Block18);
		this.Block19= new BlockObj(this);
		this.Block19.X= 300f;
		this.Block19.Y= 131f;
		this.Block19.Width= 40f;
		this.Block19.Height= 40f;
		this.Block19.Name= "636508994820505995";
		this.Block19.Zindex= 0;
		this.AddObjectToRegion(this.Block19);
		this.Block20= new BlockObj(this);
		this.Block20.X= 492f;
		this.Block20.Y= 125f;
		this.Block20.Width= 40f;
		this.Block20.Height= 40f;
		this.Block20.Name= "636508994841077172";
		this.Block20.Zindex= 0;
		this.AddObjectToRegion(this.Block20);
		this.Block21= new BlockObj(this);
		this.Block21.X= 451f;
		this.Block21.Y= 128f;
		this.Block21.Width= 40f;
		this.Block21.Height= 40f;
		this.Block21.Name= "636508994867948709";
		this.Block21.Zindex= 0;
		this.AddObjectToRegion(this.Block21);
		this.Block22= new BlockObj(this);
		this.Block22.X= 408f;
		this.Block22.Y= 129f;
		this.Block22.Width= 40f;
		this.Block22.Height= 40f;
		this.Block22.Name= "636508994898300445";
		this.Block22.Zindex= 0;
		this.AddObjectToRegion(this.Block22);
		this.Diamond23= new DiamondObj(this);
		this.Diamond23.X= 267f;
		this.Diamond23.Y= 244f;
		this.Diamond23.Width= 40f;
		this.Diamond23.Height= 40f;
		this.Diamond23.Name= "636509006942710255";
		this.Diamond23.Zindex= 0;
		this.AddObjectToRegion(this.Diamond23);
		this.Diamond24= new DiamondObj(this);
		this.Diamond24.X= 491f;
		this.Diamond24.Y= 245f;
		this.Diamond24.Width= 40f;
		this.Diamond24.Height= 40f;
		this.Diamond24.Name= "636509006953625793";
		this.Diamond24.Zindex= 0;
		this.AddObjectToRegion(this.Diamond24);
		this.Diamond25= new DiamondObj(this);
		this.Diamond25.X= 358f;
		this.Diamond25.Y= 79f;
		this.Diamond25.Width= 40f;
		this.Diamond25.Height= 40f;
		this.Diamond25.Name= "636509006964321328";
		this.Diamond25.Zindex= 0;
		this.AddObjectToRegion(this.Diamond25);
		this.Diamond26= new DiamondObj(this);
		this.Diamond26.X= 211f;
		this.Diamond26.Y= 77f;
		this.Diamond26.Width= 40f;
		this.Diamond26.Height= 40f;
		this.Diamond26.Name= "636509006972341747";
		this.Diamond26.Zindex= 0;
		this.AddObjectToRegion(this.Diamond26);
		this.Diamond27= new DiamondObj(this);
		this.Diamond27.X= 536f;
		this.Diamond27.Y= 79f;
		this.Diamond27.Width= 40f;
		this.Diamond27.Height= 40f;
		this.Diamond27.Name= "636509006984972388";
		this.Diamond27.Zindex= 0;
		this.AddObjectToRegion(this.Diamond27);
		this.Diamond28= new DiamondObj(this);
		this.Diamond28.X= 745f;
		this.Diamond28.Y= 364f;
		this.Diamond28.Width= 40f;
		this.Diamond28.Height= 40f;
		this.Diamond28.Name= "636509006992032754";
		this.Diamond28.Zindex= 0;
		this.AddObjectToRegion(this.Diamond28);
		this.Diamond29= new DiamondObj(this);
		this.Diamond29.X= 732f;
		this.Diamond29.Y= 428f;
		this.Diamond29.Width= 40f;
		this.Diamond29.Height= 40f;
		this.Diamond29.Name= "636509007001448233";
		this.Diamond29.Zindex= 0;
		this.AddObjectToRegion(this.Diamond29);
		this.Diamond30= new DiamondObj(this);
		this.Diamond30.X= 651f;
		this.Diamond30.Y= 428f;
		this.Diamond30.Width= 40f;
		this.Diamond30.Height= 40f;
		this.Diamond30.Name= "636509007005123405";
		this.Diamond30.Zindex= 0;
		this.AddObjectToRegion(this.Diamond30);
		this.Diamond31= new DiamondObj(this);
		this.Diamond31.X= 10f;
		this.Diamond31.Y= 348f;
		this.Diamond31.Width= 40f;
		this.Diamond31.Height= 40f;
		this.Diamond31.Name= "636509007029289597";
		this.Diamond31.Zindex= 0;
		this.AddObjectToRegion(this.Diamond31);
		this.Diamond32= new DiamondObj(this);
		this.Diamond32.X= 51f;
		this.Diamond32.Y= 387f;
		this.Diamond32.Width= 40f;
		this.Diamond32.Height= 40f;
		this.Diamond32.Name= "636509007043965338";
		this.Diamond32.Zindex= 0;
		this.AddObjectToRegion(this.Diamond32);
		this.Diamond33= new DiamondObj(this);
		this.Diamond33.X= 93f;
		this.Diamond33.Y= 426f;
		this.Diamond33.Width= 40f;
		this.Diamond33.Height= 40f;
		this.Diamond33.Name= "636509007063196293";
		this.Diamond33.Zindex= 0;
		this.AddObjectToRegion(this.Diamond33);
		this.Diamond34= new DiamondObj(this);
		this.Diamond34.X= 105f;
		this.Diamond34.Y= 381f;
		this.Diamond34.Width= 40f;
		this.Diamond34.Height= 40f;
		this.Diamond34.Name= "636509007106953479";
		this.Diamond34.Zindex= 0;
		this.AddObjectToRegion(this.Diamond34);
		this.Diamond35= new DiamondObj(this);
		this.Diamond35.X= 98f;
		this.Diamond35.Y= 319f;
		this.Diamond35.Width= 40f;
		this.Diamond35.Height= 40f;
		this.Diamond35.Name= "636509007111018702";
		this.Diamond35.Zindex= 0;
		this.AddObjectToRegion(this.Diamond35);
		this.Diamond36= new DiamondObj(this);
		this.Diamond36.X= 62f;
		this.Diamond36.Y= 447f;
		this.Diamond36.Width= 40f;
		this.Diamond36.Height= 40f;
		this.Diamond36.Name= "636509007122849297";
		this.Diamond36.Zindex= 0;
		this.AddObjectToRegion(this.Diamond36);
		this.Diamond37= new DiamondObj(this);
		this.Diamond37.X= 156f;
		this.Diamond37.Y= 399f;
		this.Diamond37.Width= 40f;
		this.Diamond37.Height= 40f;
		this.Diamond37.Name= "636509007139395134";
		this.Diamond37.Zindex= 0;
		this.AddObjectToRegion(this.Diamond37);
		Kid.Eyes.Target = Ship0;
	}

	@Override
	public void Dispose()
	{
		super.Dispose();
		this.Ship0= null;
		this.Block1= null;
		this.Block2= null;
		this.Block3= null;
		this.Block4= null;
		this.Block5= null;
		this.Block6= null;
		this.Block7= null;
		this.Block8= null;
		this.Block9= null;
		this.Block10= null;
		this.Block11= null;
		this.Block12= null;
		this.Block13= null;
		this.Block14= null;
		this.Block15= null;
		this.Block16= null;
		this.Block17= null;
		this.Block18= null;
		this.Block19= null;
		this.Block20= null;
		this.Block21= null;
		this.Block22= null;
		this.Diamond23= null;
		this.Diamond24= null;
		this.Diamond25= null;
		this.Diamond26= null;
		this.Diamond27= null;
		this.Diamond28= null;
		this.Diamond29= null;
		this.Diamond30= null;
		this.Diamond31= null;
		this.Diamond32= null;
		this.Diamond33= null;
		this.Diamond34= null;
		this.Diamond35= null;
		this.Diamond36= null;
		this.Diamond37= null;
	}
}

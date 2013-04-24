package com.fisat.farmville;



import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class VilleActivity extends Activity implements OnClickListener {

	SharedPreferences preferences ;
	Button langButton;
	Button refreshButton;
	
	TextView item1;
	TextView item2;
	TextView item3;
	TextView item4;
	TextView item5;
	TextView item6;
	TextView item7;
	TextView item8;
	TextView item9;
	TextView item10;
	TextView item11;
	TextView item12;
	TextView item13;
	TextView item14;
	TextView item15;
	TextView item16;
	TextView item17;
	TextView item18;
	TextView item19;
	TextView item20;
	TextView item21;
	TextView item22;
	TextView item23;
	TextView item24;
	TextView item25;
	TextView item26;
	TextView item27;
	TextView item28;
	TextView item29;

	TextView value1;
	TextView value2;
	TextView value3;
	TextView value4;
	TextView value5;
	TextView value6;
	TextView value7;
	TextView value8;
	TextView value9;
	TextView value10;
	TextView value11;
	TextView value12;
	TextView value13;
	TextView value14;
	TextView value15;
	TextView value16;
	TextView value17;
	TextView value18;
	TextView value19;
	TextView value20;
	TextView value21;
	TextView value22;
	TextView value23;
	TextView value24;
	TextView value25;
	TextView value26;
	TextView value27;
	TextView value28;
	TextView value29;
	
	String Items;
	int flag=0;
	NetClient httpClient;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ville);
        langButton=(Button) this.findViewById(R.id.button1);
        refreshButton=(Button) this.findViewById(R.id.button2);
        
        
        item1=(TextView) this.findViewById(R.id.item1);
        item2=(TextView) this.findViewById(R.id.item2);
        item3=(TextView) this.findViewById(R.id.item3);
        item4=(TextView) this.findViewById(R.id.item4);
        item5=(TextView) this.findViewById(R.id.item5);
        item6=(TextView) this.findViewById(R.id.item6);
        item7=(TextView) this.findViewById(R.id.item7);
        item8=(TextView) this.findViewById(R.id.item8);
        item9=(TextView) this.findViewById(R.id.item9);
        item10=(TextView) this.findViewById(R.id.item10);
        item11=(TextView) this.findViewById(R.id.item11);
        item12=(TextView) this.findViewById(R.id.item12);
        item13=(TextView) this.findViewById(R.id.item13);
        item14=(TextView) this.findViewById(R.id.item14);
        item15=(TextView) this.findViewById(R.id.item15);
        item16=(TextView) this.findViewById(R.id.item16);
        item17=(TextView) this.findViewById(R.id.item17);
        item18=(TextView) this.findViewById(R.id.item18);
        item19=(TextView) this.findViewById(R.id.item19);
        item20=(TextView) this.findViewById(R.id.item20);
        item21=(TextView) this.findViewById(R.id.item21);
        item22=(TextView) this.findViewById(R.id.item22);
        item23=(TextView) this.findViewById(R.id.item23);
        item24=(TextView) this.findViewById(R.id.item24);
        item25=(TextView) this.findViewById(R.id.item25);
        item26=(TextView) this.findViewById(R.id.item26);
        item27=(TextView) this.findViewById(R.id.item27);
        item28=(TextView) this.findViewById(R.id.item28);
        item29=(TextView) this.findViewById(R.id.item29);
        
        value1 = (TextView) this.findViewById(R.id.value1);
        value2 = (TextView) this.findViewById(R.id.value2);
        value3 = (TextView) this.findViewById(R.id.value3);
        value4 = (TextView) this.findViewById(R.id.value4);
        value5 = (TextView) this.findViewById(R.id.value5);
        value6 = (TextView) this.findViewById(R.id.value6);
        value7 = (TextView) this.findViewById(R.id.value7);
        value8 = (TextView) this.findViewById(R.id.value8);
        value9 = (TextView) this.findViewById(R.id.value9);
        value10 = (TextView) this.findViewById(R.id.value10);
        value11 = (TextView) this.findViewById(R.id.value11);
        value12 = (TextView) this.findViewById(R.id.value12);
        value13 = (TextView) this.findViewById(R.id.value13);
        value14 = (TextView) this.findViewById(R.id.value14);
        value15 = (TextView) this.findViewById(R.id.value15);
        value16 = (TextView) this.findViewById(R.id.value16);
        value17 = (TextView) this.findViewById(R.id.value17);
        value18 = (TextView) this.findViewById(R.id.value18);
        value19 = (TextView) this.findViewById(R.id.value19);
        value20 = (TextView) this.findViewById(R.id.value20);
        value21 = (TextView) this.findViewById(R.id.value21);
        value22 = (TextView) this.findViewById(R.id.value22);
        value23 = (TextView) this.findViewById(R.id.value23);
        value24 = (TextView) this.findViewById(R.id.value24);
        value25 = (TextView) this.findViewById(R.id.value25);
        value26 = (TextView) this.findViewById(R.id.value26);
        value27 = (TextView) this.findViewById(R.id.value27);
        value28 = (TextView) this.findViewById(R.id.value28);
        value29 = (TextView) this.findViewById(R.id.value29);
         
        
        langButton.setOnClickListener(this);
        refreshButton.setOnClickListener(this);
        preferences  = PreferenceManager.getDefaultSharedPreferences(this.getBaseContext());
        String	lang=preferences.getString("defaultlan", "");
        
    	if (lang.trim().equals("") || lang==null)
    	{
    		lang=Const.settings.defaultlan;
    		
    	}
    	if (lang=="MAL")
    	{
    		
    		langButton.setText(R.string.elang);
    		changeLanguage("MAL");
    		   		
    	}
    	else
    	{
    		langButton.setText(R.string.mlang);
    		changeLanguage("ENG");
    	}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ville, menu);
        return true;
    }

	@Override
	public void onClick(View view) {
		int id=view.getId();
		switch(id)
		{
			case R.id.button1:
			{
				CharSequence mlang = getResources().getString(R.string.mlang);
				CharSequence elang = getResources().getString(R.string.elang);
				if(langButton.getText()==elang)
				{
					langButton.setText(R.string.mlang);
					changeLanguage("ENG");
					
				}
				else
				{
					langButton.setText(R.string.elang);
					changeLanguage("MAL");
				}
				break;
			
			
			}
			case R.id.button2:
			{
				//httpClient.connect("http://www.keralaagriculture.gov.in/pricelistnew.html");
				
				getAndDisplay();
			}
		}
		
	}
	private void getAndDisplay() {
		
	
		Thread thread = new Thread()
		{
		   
		    
			@Override
		    public void run() {

				
               // URLConnection conn;
				try {
					
					
			                Document doc = Jsoup.connect("http://www.keralaagriculture.gov.in/pricelistnew.html").get();
			                org.jsoup.nodes.Element body = doc.body();
			                Elements tds = body.getElementsByTag("td");
			                for (org.jsoup.nodes.Element td : tds) {
			                  //String linkHref = link.attr("href");
			                  Items=Items+td.text()+"#";
			                  
			                  
			                }
			                flag=1;
			         //String[] ItemList=Items.split("#");
				
			     
			     }
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                // Get the response
                
		    }
		};

		thread.start();
		if(flag==1){
			display();
		}

	}
	
	private void display()
	{ 
		//Toast.makeText(this, Items,Toast.LENGTH_LONG).show();
		String[] ItemList=Items.split("#");
		//for(int i=0;i<ItemList.length;i++)
		//value1.setText(ItemList[0]);
		
		value1.setText(ItemList[13]);
        value2.setText(ItemList[21]);
        value3.setText(ItemList[26]);
        value4.setText(ItemList[31]);
        value5.setText(ItemList[36]);
        value6.setText(ItemList[41]);
        value7.setText(ItemList[46]);
        value8.setText(ItemList[51]);
        value9.setText(ItemList[56]);
        value10.setText(ItemList[61]);
        value11.setText(ItemList[66]);
        value12.setText(ItemList[71]);
        value13.setText(ItemList[76]);
        value14.setText(ItemList[81]);
        value15.setText(ItemList[86]);
        value16.setText(ItemList[91]);
        value17.setText(ItemList[96]);
        value18.setText(ItemList[111]);
        value19.setText(ItemList[116]);
        value20.setText(ItemList[126]);
        value21.setText(ItemList[131]);
        value22.setText(ItemList[136]);
        value23.setText(ItemList[141]);
        value24.setText(ItemList[146]);
        value25.setText(ItemList[151]);
        value26.setText(ItemList[156]);
        value27.setText(ItemList[161]);
        value28.setText(ItemList[166]);
        value29.setText(ItemList[171]);
        flag=0;
        
	}

	private void changeLanguage(CharSequence charSequence)
	{
		CharSequence mlang = getResources().getString(R.string.mlang);
		CharSequence elang = getResources().getString(R.string.mlang);
		SharedPreferences.Editor editor = preferences.edit();
		if(charSequence==elang || charSequence=="ENG")
		{
			
			item1.setText(R.string.eitem1);
			item2.setText(R.string.eitem2);
			item3.setText(R.string.eitem3);
			item4.setText(R.string.eitem4);
			item5.setText(R.string.eitem5);
			item6.setText(R.string.eitem6);
			item7.setText(R.string.eitem7);
			item8.setText(R.string.eitem8);
			item9.setText(R.string.eitem9);
			item10.setText(R.string.eitem10);
			item11.setText(R.string.eitem11);
			item12.setText(R.string.eitem12);
			item13.setText(R.string.eitem13);
			item14.setText(R.string.eitem14);
			item15.setText(R.string.eitem15);
			item16.setText(R.string.eitem16);
			item17.setText(R.string.eitem17);
			item18.setText(R.string.eitem18);
			item19.setText(R.string.eitem19);
			item20.setText(R.string.eitem20);
			item21.setText(R.string.eitem21);
			item22.setText(R.string.eitem22);
			item23.setText(R.string.eitem23);
			item24.setText(R.string.eitem24);
			item25.setText(R.string.eitem25);
			item26.setText(R.string.eitem26);
			item27.setText(R.string.eitem27);
			item28.setText(R.string.eitem28);
			item29.setText(R.string.eitem29);
			
			editor.putString("defaultlan","ENG");
			
		}
		else
		{
			item1.setText(R.string.mitem1);
			item2.setText(R.string.mitem2);
			item3.setText(R.string.mitem3);
			item4.setText(R.string.mitem4);
			item5.setText(R.string.mitem5);
			item6.setText(R.string.mitem6);
			item7.setText(R.string.mitem7);
			item8.setText(R.string.mitem8);
			item9.setText(R.string.mitem9);
			item10.setText(R.string.mitem10);
			item11.setText(R.string.mitem11);
			item12.setText(R.string.mitem12);
			item13.setText(R.string.mitem13);
			item14.setText(R.string.mitem14);
			item15.setText(R.string.mitem15);
			item16.setText(R.string.mitem16);
			item17.setText(R.string.mitem17);
			item18.setText(R.string.mitem18);
			item19.setText(R.string.mitem19);
			item20.setText(R.string.mitem20);
			item21.setText(R.string.mitem21);
			item22.setText(R.string.mitem22);
			item23.setText(R.string.mitem23);
			item24.setText(R.string.mitem24);
			item25.setText(R.string.mitem25);
			item26.setText(R.string.mitem26);
			item27.setText(R.string.mitem27);
			item28.setText(R.string.mitem28);
			item29.setText(R.string.mitem29);
			
			editor.putString("defaultlan","MAL");
		}
	}
}

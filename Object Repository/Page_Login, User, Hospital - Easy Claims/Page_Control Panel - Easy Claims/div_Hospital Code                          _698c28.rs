<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Hospital Code                          _698c28</name>
   <tag></tag>
   <elementGuidId>7f365daa-4983-4f9c-9c07-c1062cc202cf</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#hospitalInfoWindow</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='hospitalInfoWindow']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:label=&quot;Add Hospital&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>d2053b12-22d5-4481-b94d-539590191440</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>hospitalInfoWindow</value>
      <webElementGuid>3e37a1a0-fe07-4d72-a0b8-e9ac2017a91a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-role</name>
      <type>Main</type>
      <value>window</value>
      <webElementGuid>7ffc962b-9d14-4f69-b579-55287b2c6210</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>k-window-content</value>
      <webElementGuid>e77cba38-1bfe-4a62-a9da-dc5281ec259e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>772d7c77-9fda-4c32-a90a-f1dbf3432626</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
      <webElementGuid>9f78ff6f-92dd-4ae8-9847-835170c0b8d8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>hospitalInfoWindow_wnd_title</value>
      <webElementGuid>c1467388-70c5-4018-a076-5f8125deced5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
             
            
            
                
                    Hospital Code
                    
                        
                    
                
                
                    PMCC No
                    
                        
                    
                
                
                    Hospital Name
                    
                        
                    
                
                
                    Hospital Email
                    
                        
                    
                
                
                    Hospital Level
                    
                        Hospital Level 1
                    
                
                
                    Connect Username
                    
                        
                    
                
                
                    Password
                    
                        
                    
                
                
                    Confirm password
                    
                        
                    
                
                
                    
                    
                        
                    
                
                 
                    Name Of HCI Representative
                    
                        
                    
                
                
                    Official Capacity Or Designation
                    
                        
                    
                
                
                    BlockNo/LotNo
                    
                        
                    
                
                
                    Building No. Name
                    
                        
                    
                
                
                    Subd/Village
                    
                        
                    
                
                
                    Street
                    
                        
                    
                
                 
                    Barangay
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressBrgy&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/BarangayLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:barangayValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Barangay&quot;,&quot;suggest&quot;:true});});

                    
                
                
                   City/Municipality
                       
                            
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressCityMunicipality&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/CitiesLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:municipalityValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;City/Municipality&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    Province
                    
                        Province
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressProvinceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/AddressProvinceLibrary&quot;}},&quot;sort&quot;:[{&quot;field&quot;:&quot;Description&quot;,&quot;dir&quot;:&quot;asc&quot;}]},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Province&quot;});});

                    
                
                
                   Zip Code
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_ZipCodeId&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/ZipCodesLibrary&quot;}},&quot;pageSize&quot;:10,&quot;page&quot;:0,&quot;groupPaging&quot;:false,&quot;total&quot;:0},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:zipcodeValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Zip Code&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    
                    
                        
                    
                
            
        
    </value>
      <webElementGuid>654bbff1-3303-4293-b0b9-da06ca7899dc</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;hospitalInfoWindow&quot;)</value>
      <webElementGuid>8517add3-e3cc-43e9-85cc-6771d1033af2</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='hospitalInfoWindow']</value>
      <webElementGuid>2f9ef012-f8d9-493d-8328-fc0c244723bb</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Add Hospital'])[1]/following::div[2]</value>
      <webElementGuid>0f0b83a0-969b-486f-baa5-857aa1613869</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Password'])[2]/following::div[5]</value>
      <webElementGuid>05e8406f-bb70-4e24-9405-aef8e2dc0bd5</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[23]/div[2]</value>
      <webElementGuid>5e3fd1ff-0238-4fad-881f-a6ce381acb5c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'hospitalInfoWindow' and (text() = '
        
             
            
            
                
                    Hospital Code
                    
                        
                    
                
                
                    PMCC No
                    
                        
                    
                
                
                    Hospital Name
                    
                        
                    
                
                
                    Hospital Email
                    
                        
                    
                
                
                    Hospital Level
                    
                        Hospital Level 1
                    
                
                
                    Connect Username
                    
                        
                    
                
                
                    Password
                    
                        
                    
                
                
                    Confirm password
                    
                        
                    
                
                
                    
                    
                        
                    
                
                 
                    Name Of HCI Representative
                    
                        
                    
                
                
                    Official Capacity Or Designation
                    
                        
                    
                
                
                    BlockNo/LotNo
                    
                        
                    
                
                
                    Building No. Name
                    
                        
                    
                
                
                    Subd/Village
                    
                        
                    
                
                
                    Street
                    
                        
                    
                
                 
                    Barangay
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressBrgy&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/BarangayLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:barangayValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Barangay&quot;,&quot;suggest&quot;:true});});

                    
                
                
                   City/Municipality
                       
                            
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressCityMunicipality&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/CitiesLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:municipalityValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;City/Municipality&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    Province
                    
                        Province
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressProvinceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/AddressProvinceLibrary&quot;}},&quot;sort&quot;:[{&quot;field&quot;:&quot;Description&quot;,&quot;dir&quot;:&quot;asc&quot;}]},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Province&quot;});});

                    
                
                
                   Zip Code
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_ZipCodeId&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/ZipCodesLibrary&quot;}},&quot;pageSize&quot;:10,&quot;page&quot;:0,&quot;groupPaging&quot;:false,&quot;total&quot;:0},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:zipcodeValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Zip Code&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    
                    
                        
                    
                
            
        
    ' or . = '
        
             
            
            
                
                    Hospital Code
                    
                        
                    
                
                
                    PMCC No
                    
                        
                    
                
                
                    Hospital Name
                    
                        
                    
                
                
                    Hospital Email
                    
                        
                    
                
                
                    Hospital Level
                    
                        Hospital Level 1
                    
                
                
                    Connect Username
                    
                        
                    
                
                
                    Password
                    
                        
                    
                
                
                    Confirm password
                    
                        
                    
                
                
                    
                    
                        
                    
                
                 
                    Name Of HCI Representative
                    
                        
                    
                
                
                    Official Capacity Or Designation
                    
                        
                    
                
                
                    BlockNo/LotNo
                    
                        
                    
                
                
                    Building No. Name
                    
                        
                    
                
                
                    Subd/Village
                    
                        
                    
                
                
                    Street
                    
                        
                    
                
                 
                    Barangay
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressBrgy&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/BarangayLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:barangayValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Barangay&quot;,&quot;suggest&quot;:true});});

                    
                
                
                   City/Municipality
                       
                            
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressCityMunicipality&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/CitiesLibrary&quot;}}},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:municipalityValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;City/Municipality&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    Province
                    
                        Province
	kendo.syncReady(function(){jQuery(&quot;#Hospital_AddressProvinceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/AddressProvinceLibrary&quot;}},&quot;sort&quot;:[{&quot;field&quot;:&quot;Description&quot;,&quot;dir&quot;:&quot;asc&quot;}]},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;dataValueField&quot;:&quot;Id&quot;,&quot;optionLabel&quot;:&quot;Province&quot;});});

                    
                
                
                   Zip Code
                    
                        
	kendo.syncReady(function(){jQuery(&quot;#Hospital_ZipCodeId&quot;).kendoComboBox({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/OPSUI.EasyClaims.Legacy/Library/ZipCodesLibrary&quot;}},&quot;pageSize&quot;:10,&quot;page&quot;:0,&quot;groupPaging&quot;:false,&quot;total&quot;:0},&quot;dataTextField&quot;:&quot;Description&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;virtual&quot;:{&quot;itemHeight&quot;:26,&quot;valueMapper&quot;:zipcodeValueMapper},&quot;dataValueField&quot;:&quot;Id&quot;,&quot;placeholder&quot;:&quot;Zip Code&quot;,&quot;suggest&quot;:true});});

                    
                
                
                    
                    
                        
                    
                
            
        
    ')]</value>
      <webElementGuid>e8f3504a-681a-4cf0-9dea-7733cbc6028f</webElementGuid>
   </webElementXpaths>
</WebElementEntity>

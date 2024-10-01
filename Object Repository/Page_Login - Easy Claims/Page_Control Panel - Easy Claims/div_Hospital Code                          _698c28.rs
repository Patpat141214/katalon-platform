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
      <webElementGuid>82f15d66-127f-4704-91e4-6292498adeaa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>hospitalInfoWindow</value>
      <webElementGuid>b1b0de9e-a372-411e-a1f1-2e0fbea8ec14</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-role</name>
      <type>Main</type>
      <value>window</value>
      <webElementGuid>8a3481ef-84cb-40fd-a0b2-19a06c73e7b6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>k-window-content</value>
      <webElementGuid>2755878e-4d61-48c5-b723-dddf90325441</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>576b5dd9-e9bb-4197-96ea-5c8feb444c01</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
      <webElementGuid>488e85b8-0143-49e7-b435-9c9d355b0920</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>hospitalInfoWindow_wnd_title</value>
      <webElementGuid>ccc95e75-aad4-4088-8ebe-cdd8fc916da5</webElementGuid>
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
      <webElementGuid>e74ba8a1-d426-4aaf-8c99-58a25210c083</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;hospitalInfoWindow&quot;)</value>
      <webElementGuid>dd32b6c6-0726-4b39-afc0-35660bf3bf55</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='hospitalInfoWindow']</value>
      <webElementGuid>3b367a87-bd57-4f4c-8ebc-6a84177f37c9</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Add Hospital'])[1]/following::div[2]</value>
      <webElementGuid>d8a4798b-8747-47e2-922b-7a0b642b8ff1</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Password'])[2]/following::div[5]</value>
      <webElementGuid>37f00a68-118c-4092-926b-fe9048722e89</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[23]/div[2]</value>
      <webElementGuid>5916423e-1448-4b95-9057-3363909e309d</webElementGuid>
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
      <webElementGuid>9e52c2ac-c2b8-477d-b5d4-71481d173f14</webElementGuid>
   </webElementXpaths>
</WebElementEntity>

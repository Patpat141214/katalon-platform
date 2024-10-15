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
      <webElementGuid>babf16df-d512-45b4-a57d-dac36543a38c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>hospitalInfoWindow</value>
      <webElementGuid>d65fe3cc-c997-4aa4-bb44-1eb94ead5877</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-role</name>
      <type>Main</type>
      <value>window</value>
      <webElementGuid>7790fcbd-066d-4b7a-9058-72479b0edfa1</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>k-window-content</value>
      <webElementGuid>b86c7807-d225-461a-ada2-af2023140392</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>de45b8fc-3402-4034-8e40-e78a6ecd2afa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
      <webElementGuid>13051776-25e2-4ffa-9c88-54c3539db446</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>hospitalInfoWindow_wnd_title</value>
      <webElementGuid>0a3708e2-7f8e-4bdb-85e5-f44485b2c2c0</webElementGuid>
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
      <webElementGuid>629be481-d3ea-4902-8b3e-9a37c98b637a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;hospitalInfoWindow&quot;)</value>
      <webElementGuid>e797c937-3b99-4a0b-9d67-770e29cc6a84</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='hospitalInfoWindow']</value>
      <webElementGuid>ee7efd27-7ffe-4caa-a865-b6c804693276</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Add Hospital'])[1]/following::div[2]</value>
      <webElementGuid>456daf16-9821-43c4-b90b-31273cd3c31d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Password'])[2]/following::div[5]</value>
      <webElementGuid>94e2b12e-6204-4f23-85af-a1bc5193dc2d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[23]/div[2]</value>
      <webElementGuid>33a09285-19e3-4a1b-a485-abab4a907282</webElementGuid>
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
      <webElementGuid>44ba8230-39fa-4c52-887b-021912af94d2</webElementGuid>
   </webElementXpaths>
</WebElementEntity>

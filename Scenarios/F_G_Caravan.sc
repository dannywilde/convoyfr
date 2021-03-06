﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/F_G_Caravan.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>98</x>
        <y>155</y>
        <position>
          <x>98</x>
          <y>155</y>
        </position>
        <center>
          <x>200.5</x>
          <y>255.5</y>
        </center>
        <min>
          <x>98</x>
          <y>155</y>
        </min>
        <max>
          <x>303</x>
          <y>356</y>
        </max>
        <width>205</width>
        <height>201</height>
        <size>
          <x>205</x>
          <y>201</y>
        </size>
        <xMin>98</xMin>
        <yMin>155</yMin>
        <xMax>303</xMax>
        <yMax>356</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You spot a dust cloud in the distance, it seems to be a travelling caravan. 

They appear to have hired privateers to protect them. Attacking them with the little fuel you have left would be nigh impossible.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>65</y>
                <position>
                  <x>193</x>
                  <y>65</y>
                </position>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <min>
                  <x>193</x>
                  <y>65</y>
                </min>
                <max>
                  <x>203</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Radio them.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>109</y>
                <position>
                  <x>193</x>
                  <y>109</y>
                </position>
                <center>
                  <x>198</x>
                  <y>114</y>
                </center>
                <min>
                  <x>193</x>
                  <y>109</y>
                </min>
                <max>
                  <x>203</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>109</yMin>
                <xMax>203</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>6</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>145</y>
                <position>
                  <x>193</x>
                  <y>145</y>
                </position>
                <center>
                  <x>198</x>
                  <y>150</y>
                </center>
                <min>
                  <x>193</x>
                  <y>145</y>
                </min>
                <max>
                  <x>203</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>145</yMin>
                <xMax>203</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>163</y>
                <position>
                  <x>193</x>
                  <y>163</y>
                </position>
                <center>
                  <x>198</x>
                  <y>168</y>
                </center>
                <min>
                  <x>193</x>
                  <y>163</y>
                </min>
                <max>
                  <x>203</x>
                  <y>173</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>163</yMin>
                <xMax>203</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>2</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>181</y>
                <position>
                  <x>193</x>
                  <y>181</y>
                </position>
                <center>
                  <x>198</x>
                  <y>186</y>
                </center>
                <min>
                  <x>193</x>
                  <y>181</y>
                </min>
                <max>
                  <x>203</x>
                  <y>191</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>181</yMin>
                <xMax>203</xMax>
                <yMax>191</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>3</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Attack them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>287</x>
        <y>700</y>
        <position>
          <x>287</x>
          <y>700</y>
        </position>
        <center>
          <x>363</x>
          <y>769.5</y>
        </center>
        <min>
          <x>287</x>
          <y>700</y>
        </min>
        <max>
          <x>439</x>
          <y>839</y>
        </max>
        <width>152</width>
        <height>139</height>
        <size>
          <x>152</x>
          <y>139</y>
        </size>
        <xMin>287</xMin>
        <yMin>700</yMin>
        <xMax>439</xMax>
        <yMax>839</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>All the privateer vehicles have been destroyed, but the caravan has escaped.

You spend all your efforts on trying to recover fuel, leaving you no possibility to find scrap.

Eventually, you manage to recover [0#].</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>65</y>
                <position>
                  <x>140</x>
                  <y>65</y>
                </position>
                <center>
                  <x>145</x>
                  <y>70</y>
                </center>
                <min>
                  <x>140</x>
                  <y>65</y>
                </min>
                <max>
                  <x>150</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>65</yMin>
                <xMax>150</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>24</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>83</y>
                <position>
                  <x>140</x>
                  <y>83</y>
                </position>
                <center>
                  <x>145</x>
                  <y>88</y>
                </center>
                <min>
                  <x>140</x>
                  <y>83</y>
                </min>
                <max>
                  <x>150</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>83</yMin>
                <xMax>150</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>27</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>101</y>
                <position>
                  <x>140</x>
                  <y>101</y>
                </position>
                <center>
                  <x>145</x>
                  <y>106</y>
                </center>
                <min>
                  <x>140</x>
                  <y>101</y>
                </min>
                <max>
                  <x>150</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>101</yMin>
                <xMax>150</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>30</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>140</x>
                <y>119</y>
                <position>
                  <x>140</x>
                  <y>119</y>
                </position>
                <center>
                  <x>145</x>
                  <y>124</y>
                </center>
                <min>
                  <x>140</x>
                  <y>119</y>
                </min>
                <max>
                  <x>150</x>
                  <y>129</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>140</xMin>
                <yMin>119</yMin>
                <xMax>150</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>36</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Get out of here!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>726</x>
        <y>94</y>
        <position>
          <x>726</x>
          <y>94</y>
        </position>
        <center>
          <x>803</x>
          <y>246.5</y>
        </center>
        <min>
          <x>726</x>
          <y>94</y>
        </min>
        <max>
          <x>880</x>
          <y>399</y>
        </max>
        <width>154</width>
        <height>305</height>
        <size>
          <x>154</x>
          <y>305</y>
        </size>
        <xMin>726</xMin>
        <yMin>94</yMin>
        <xMax>880</xMax>
        <yMax>399</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Greetings.

We are part of the K.J.L. trading company and heard your emergency broadcast, we understand you ran out of fuel.

We are happy to provide some fuel at a discount!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>65</y>
                <position>
                  <x>142</x>
                  <y>65</y>
                </position>
                <center>
                  <x>147</x>
                  <y>70</y>
                </center>
                <min>
                  <x>142</x>
                  <y>65</y>
                </min>
                <max>
                  <x>152</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>65</yMin>
                <xMax>152</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-15</Amount>
              <fuelAmount>10</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy [#] for [$].</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>109</y>
                <position>
                  <x>142</x>
                  <y>109</y>
                </position>
                <center>
                  <x>147</x>
                  <y>114</y>
                </center>
                <min>
                  <x>142</x>
                  <y>109</y>
                </min>
                <max>
                  <x>152</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>109</yMin>
                <xMax>152</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-30</Amount>
              <fuelAmount>20</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy [#] for [$].</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>153</y>
                <position>
                  <x>142</x>
                  <y>153</y>
                </position>
                <center>
                  <x>147</x>
                  <y>158</y>
                </center>
                <min>
                  <x>142</x>
                  <y>153</y>
                </min>
                <max>
                  <x>152</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>153</yMin>
                <xMax>152</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-45</Amount>
              <fuelAmount>30</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy [#] for [$].</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>197</y>
                <position>
                  <x>142</x>
                  <y>197</y>
                </position>
                <center>
                  <x>147</x>
                  <y>202</y>
                </center>
                <min>
                  <x>142</x>
                  <y>197</y>
                </min>
                <max>
                  <x>152</x>
                  <y>207</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>197</yMin>
                <xMax>152</xMax>
                <yMax>207</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-60</Amount>
              <fuelAmount>40</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy [#] for [$].</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>241</y>
                <position>
                  <x>142</x>
                  <y>241</y>
                </position>
                <center>
                  <x>147</x>
                  <y>246</y>
                </center>
                <min>
                  <x>142</x>
                  <y>241</y>
                </min>
                <max>
                  <x>152</x>
                  <y>251</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>241</yMin>
                <xMax>152</xMax>
                <yMax>251</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-75</Amount>
              <fuelAmount>50</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy [#] for [$].</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>142</x>
                <y>285</y>
                <position>
                  <x>142</x>
                  <y>285</y>
                </position>
                <center>
                  <x>147</x>
                  <y>290</y>
                </center>
                <min>
                  <x>142</x>
                  <y>285</y>
                </min>
                <max>
                  <x>152</x>
                  <y>295</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>142</xMin>
                <yMin>285</yMin>
                <xMax>152</xMax>
                <yMax>295</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Not interested.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1017</x>
        <y>388</y>
        <position>
          <x>1017</x>
          <y>388</y>
        </position>
        <center>
          <x>1095.5</x>
          <y>438</y>
        </center>
        <min>
          <x>1017</x>
          <y>388</y>
        </min>
        <max>
          <x>1174</x>
          <y>488</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>1017</xMin>
        <yMin>388</yMin>
        <xMax>1174</xMax>
        <yMax>488</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Very well, we're sure you have other options available.

Good day!"

The caravan leaves you behind... you remain stranded without any fuel.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Damn...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>468</x>
        <y>244</y>
        <position>
          <x>468</x>
          <y>244</y>
        </position>
        <center>
          <x>557</x>
          <y>307.5</y>
        </center>
        <min>
          <x>468</x>
          <y>244</y>
        </min>
        <max>
          <x>646</x>
          <y>371</y>
        </max>
        <width>178</width>
        <height>127</height>
        <size>
          <x>178</x>
          <y>127</y>
        </size>
        <xMin>468</xMin>
        <yMin>244</yMin>
        <xMax>646</xMax>
        <yMax>371</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Nevermind the "nigh", it is truly impossible.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>166</x>
                <y>65</y>
                <position>
                  <x>166</x>
                  <y>65</y>
                </position>
                <center>
                  <x>171</x>
                  <y>70</y>
                </center>
                <min>
                  <x>166</x>
                  <y>65</y>
                </min>
                <max>
                  <x>176</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>166</xMin>
                <yMin>65</yMin>
                <xMax>176</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Very well, hail them.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Fine, let them be.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1072</x>
        <y>194</y>
        <position>
          <x>1072</x>
          <y>194</y>
        </position>
        <center>
          <x>1150.5</x>
          <y>244</y>
        </center>
        <min>
          <x>1072</x>
          <y>194</y>
        </min>
        <max>
          <x>1229</x>
          <y>294</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>1072</xMin>
        <yMin>194</yMin>
        <xMax>1229</xMax>
        <yMax>294</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Best of luck in your future endeavors!"

The K.J.L. caravan unloads your promised fuel and starts heading out.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Thanks!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>492</x>
        <y>444</y>
        <position>
          <x>492</x>
          <y>444</y>
        </position>
        <center>
          <x>570.5</x>
          <y>494</y>
        </center>
        <min>
          <x>492</x>
          <y>444</y>
        </min>
        <max>
          <x>649</x>
          <y>544</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>492</xMin>
        <yMin>444</yMin>
        <xMax>649</xMax>
        <yMax>544</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You try to squeeze the final bit of fuel out of your vehicles to engage the trading caravan.

Sadly, the defending privateers are too overwhelming and easily fend you off, damaging you in the process.

The caravan drives off, leaving you stranded.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Damn...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>F_G_Caravan</Name>
</Scenario>
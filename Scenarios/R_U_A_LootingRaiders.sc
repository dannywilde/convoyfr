﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Tutorial/R_U_A_LootingRaiders - Tutorial 2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>122</x>
        <y>306</y>
        <position>
          <x>122</x>
          <y>306</y>
        </position>
        <center>
          <x>222.5</x>
          <y>379.5</y>
        </center>
        <min>
          <x>122</x>
          <y>306</y>
        </min>
        <max>
          <x>323</x>
          <y>453</y>
        </max>
        <width>201</width>
        <height>147</height>
        <size>
          <x>201</x>
          <y>147</y>
        </size>
        <xMin>122</xMin>
        <yMin>306</yMin>
        <xMax>323</xMax>
        <yMax>453</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Driving around the abandoned city, you spot a squad of raiders in an adjacant street. 

They're busy loading a variety of looted items from the houses onto their vehicles. 

Upon noticing your convoy they panick and rush to get their vehicles started.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
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
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>-1</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>189</x>
                <y>83</y>
                <position>
                  <x>189</x>
                  <y>83</y>
                </position>
                <center>
                  <x>194</x>
                  <y>88</y>
                </center>
                <min>
                  <x>189</x>
                  <y>83</y>
                </min>
                <max>
                  <x>199</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>189</xMin>
                <yMin>83</yMin>
                <xMax>199</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Pursue the raiders.</Name>
          <convertedName />
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
          <Name>Ignore them and continue.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>216</x>
        <y>547</y>
        <position>
          <x>216</x>
          <y>547</y>
        </position>
        <center>
          <x>337</x>
          <y>597.5</y>
        </center>
        <min>
          <x>216</x>
          <y>547</y>
        </min>
        <max>
          <x>458</x>
          <y>648</y>
        </max>
        <width>242</width>
        <height>101</height>
        <size>
          <x>242</x>
          <y>101</y>
        </size>
        <xMin>216</xMin>
        <yMin>547</yMin>
        <xMax>458</xMax>
        <yMax>648</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>230</x>
                <y>65</y>
                <position>
                  <x>230</x>
                  <y>65</y>
                </position>
                <center>
                  <x>235</x>
                  <y>70</y>
                </center>
                <min>
                  <x>230</x>
                  <y>65</y>
                </min>
                <max>
                  <x>240</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>230</xMin>
                <yMin>65</yMin>
                <xMax>240</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>230</x>
                <y>83</y>
                <position>
                  <x>230</x>
                  <y>83</y>
                </position>
                <center>
                  <x>235</x>
                  <y>88</y>
                </center>
                <min>
                  <x>230</x>
                  <y>83</y>
                </min>
                <max>
                  <x>240</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>230</xMin>
                <yMin>83</yMin>
                <xMax>240</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Investigate their ill-gotten gains.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>451</x>
        <y>229</y>
        <position>
          <x>451</x>
          <y>229</y>
        </position>
        <center>
          <x>554.5</x>
          <y>301.5</y>
        </center>
        <min>
          <x>451</x>
          <y>229</y>
        </min>
        <max>
          <x>658</x>
          <y>374</y>
        </max>
        <width>207</width>
        <height>145</height>
        <size>
          <x>207</x>
          <y>145</y>
        </size>
        <xMin>451</xMin>
        <yMin>229</yMin>
        <xMax>658</xMax>
        <yMax>374</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The raiders are able to navigate the streets better than your unwieldy convoy, resulting in them gaining distance on you.</Text>
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
                <x>195</x>
                <y>65</y>
                <position>
                  <x>195</x>
                  <y>65</y>
                </position>
                <center>
                  <x>200</x>
                  <y>70</y>
                </center>
                <min>
                  <x>195</x>
                  <y>65</y>
                </min>
                <max>
                  <x>205</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>65</yMin>
                <xMax>205</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>195</x>
                <y>83</y>
                <position>
                  <x>195</x>
                  <y>83</y>
                </position>
                <center>
                  <x>200</x>
                  <y>88</y>
                </center>
                <min>
                  <x>195</x>
                  <y>83</y>
                </min>
                <max>
                  <x>205</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>83</yMin>
                <xMax>205</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge to pursue! [#]</Name>
          <convertedName />
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
          <Name>Give up chasing them.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>758</x>
        <y>298</y>
        <position>
          <x>758</x>
          <y>298</y>
        </position>
        <center>
          <x>836.5</x>
          <y>348</y>
        </center>
        <min>
          <x>758</x>
          <y>298</y>
        </min>
        <max>
          <x>915</x>
          <y>398</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>758</xMin>
        <yMin>298</yMin>
        <xMax>915</xMax>
        <yMax>398</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your supercharged engines the raiders are simply too nimble at navigating the streets.</Text>
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
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>756</x>
        <y>171</y>
        <position>
          <x>756</x>
          <y>171</y>
        </position>
        <center>
          <x>831</x>
          <y>221</y>
        </center>
        <min>
          <x>756</x>
          <y>171</y>
        </min>
        <max>
          <x>906</x>
          <y>271</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>756</xMin>
        <yMin>171</yMin>
        <xMax>906</xMax>
        <yMax>271</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to catch up to the raiders, there is no escape for them now!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
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
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Time to fight!</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>540</x>
        <y>492</y>
        <position>
          <x>540</x>
          <y>492</y>
        </position>
        <center>
          <x>632.5</x>
          <y>556.4551</y>
        </center>
        <min>
          <x>540</x>
          <y>492</y>
        </min>
        <max>
          <x>725</x>
          <y>620.910156</y>
        </max>
        <width>185</width>
        <height>128.910156</height>
        <size>
          <x>185</x>
          <y>128.910156</y>
        </size>
        <xMin>540</xMin>
        <yMin>492</yMin>
        <xMax>725</xMax>
        <yMax>620.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Within one of the vehicles you find:
[0items]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddRandomItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>173</x>
                <y>65</y>
                <position>
                  <x>173</x>
                  <y>65</y>
                </position>
                <center>
                  <x>178</x>
                  <y>70</y>
                </center>
                <min>
                  <x>173</x>
                  <y>65</y>
                </min>
                <max>
                  <x>183</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>65</yMin>
                <xMax>183</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>1</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddRandomItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>173</x>
                <y>83</y>
                <position>
                  <x>173</x>
                  <y>83</y>
                </position>
                <center>
                  <x>178</x>
                  <y>88</y>
                </center>
                <min>
                  <x>173</x>
                  <y>83</y>
                </min>
                <max>
                  <x>183</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>83</yMin>
                <xMax>183</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>2</Amount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>536</x>
        <y>637</y>
        <position>
          <x>536</x>
          <y>637</y>
        </position>
        <center>
          <x>612</x>
          <y>696.5</y>
        </center>
        <min>
          <x>536</x>
          <y>637</y>
        </min>
        <max>
          <x>688</x>
          <y>756</y>
        </max>
        <width>152</width>
        <height>119</height>
        <size>
          <x>152</x>
          <y>119</y>
        </size>
        <xMin>536</xMin>
        <yMin>637</yMin>
        <xMax>688</xMax>
        <yMax>756</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Looks like the raiders were mostly interested in resources, as you find an additional [0$] and [0#] distributed amongst the vehicles.</Text>
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
              <Amount>56</Amount>
              <fuelAmount>32</fuelAmount>
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
              <Amount>66</Amount>
              <fuelAmount>22</fuelAmount>
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
              <Amount>84</Amount>
              <fuelAmount>15</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_U_A_LootingRaiders - Tutorial 2</Name>
</Scenario>
﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/G_BeardedBunnies2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>192</x>
        <y>169</y>
        <position>
          <x>192</x>
          <y>169</y>
        </position>
        <center>
          <x>289</x>
          <y>219</y>
        </center>
        <min>
          <x>192</x>
          <y>169</y>
        </min>
        <max>
          <x>386</x>
          <y>269</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>192</xMin>
        <yMin>169</yMin>
        <xMax>386</xMax>
        <yMax>269</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>More Bearded Bunnies are upon you!</Text>
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
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight them off!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>207</x>
        <y>447</y>
        <position>
          <x>207</x>
          <y>447</y>
        </position>
        <center>
          <x>304</x>
          <y>497.5</y>
        </center>
        <min>
          <x>207</x>
          <y>447</y>
        </min>
        <max>
          <x>401</x>
          <y>548</y>
        </max>
        <width>194</width>
        <height>101</height>
        <size>
          <x>194</x>
          <y>101</y>
        </size>
        <xMin>207</xMin>
        <yMin>447</yMin>
        <xMax>401</xMax>
        <yMax>548</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You scour the horizon for any signs of more Bearded Bunnies.</Text>
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
                <x>182</x>
                <y>65</y>
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>83</y>
                <position>
                  <x>182</x>
                  <y>83</y>
                </position>
                <center>
                  <x>187</x>
                  <y>88</y>
                </center>
                <min>
                  <x>182</x>
                  <y>83</y>
                </min>
                <max>
                  <x>192</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>83</yMin>
                <xMax>192</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>G_BeardedBunnies3</nodeName>
              <nodeDiscription>Yet another group of Bearded Bunnies is attacking you!

This should be the last of them.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_BeardedBunnies2</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Continue...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>499</x>
        <y>327</y>
        <position>
          <x>499</x>
          <y>327</y>
        </position>
        <center>
          <x>575</x>
          <y>396.5</y>
        </center>
        <min>
          <x>499</x>
          <y>327</y>
        </min>
        <max>
          <x>651</x>
          <y>466</y>
        </max>
        <width>152</width>
        <height>139</height>
        <size>
          <x>152</x>
          <y>139</y>
        </size>
        <xMin>499</xMin>
        <yMin>327</yMin>
        <xMax>651</xMax>
        <yMax>466</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>There doesn't seem to be any more activity, you've defeated all the Bearded Bunny Raiders.

Hopefully this'll bring some peace to their many victims.

Searching the many wrecks, you've managed to recover [0$] and [0#].</Text>
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
              <Amount>169</Amount>
              <fuelAmount>21</fuelAmount>
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
              <Amount>201</Amount>
              <fuelAmount>15</fuelAmount>
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
              <Amount>242</Amount>
              <fuelAmount>19</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_BeardedBunnies2</Name>
</Scenario>
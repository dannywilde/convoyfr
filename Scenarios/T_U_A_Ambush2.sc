﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/T_U_A_Ambush2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>215</x>
        <y>232</y>
        <position>
          <x>215</x>
          <y>232</y>
        </position>
        <center>
          <x>326.5</x>
          <y>304.5</y>
        </center>
        <min>
          <x>215</x>
          <y>232</y>
        </min>
        <max>
          <x>438</x>
          <y>377</y>
        </max>
        <width>223</width>
        <height>145</height>
        <size>
          <x>223</x>
          <y>145</y>
        </size>
        <xMin>215</xMin>
        <yMin>232</yMin>
        <xMax>438</xMax>
        <yMax>377</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>The mostly destroyed city seems eerily quiet.</Text>
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
                <x>211</x>
                <y>65</y>
                <position>
                  <x>211</x>
                  <y>65</y>
                </position>
                <center>
                  <x>216</x>
                  <y>70</y>
                </center>
                <min>
                  <x>211</x>
                  <y>65</y>
                </min>
                <max>
                  <x>221</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>211</xMin>
                <yMin>65</yMin>
                <xMax>221</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>211</x>
                <y>83</y>
                <position>
                  <x>211</x>
                  <y>83</y>
                </position>
                <center>
                  <x>216</x>
                  <y>88</y>
                </center>
                <min>
                  <x>211</x>
                  <y>83</y>
                </min>
                <max>
                  <x>221</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>211</xMin>
                <yMin>83</yMin>
                <xMax>221</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Look out for trouble.</Name>
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
                <x>211</x>
                <y>127</y>
                <position>
                  <x>211</x>
                  <y>127</y>
                </position>
                <center>
                  <x>216</x>
                  <y>132</y>
                </center>
                <min>
                  <x>211</x>
                  <y>127</y>
                </min>
                <max>
                  <x>221</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>211</xMin>
                <yMin>127</yMin>
                <xMax>221</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge out of here. [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>343</x>
        <y>572</y>
        <position>
          <x>343</x>
          <y>572</y>
        </position>
        <center>
          <x>418</x>
          <y>622</y>
        </center>
        <min>
          <x>343</x>
          <y>572</y>
        </min>
        <max>
          <x>493</x>
          <y>672</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>343</xMin>
        <yMin>572</yMin>
        <xMax>493</xMax>
        <yMax>672</yMax>
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
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>705</x>
        <y>75</y>
        <position>
          <x>705</x>
          <y>75</y>
        </position>
        <center>
          <x>783.5</x>
          <y>125</y>
        </center>
        <min>
          <x>705</x>
          <y>75</y>
        </min>
        <max>
          <x>862</x>
          <y>175</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>705</xMin>
        <yMin>75</yMin>
        <xMax>862</xMax>
        <yMax>175</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Trouble does not appear to rear its ugly head, as you manage to traverse the city safely.</Text>
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
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>641</x>
        <y>400</y>
        <position>
          <x>641</x>
          <y>400</y>
        </position>
        <center>
          <x>719.5</x>
          <y>450</y>
        </center>
        <min>
          <x>641</x>
          <y>400</y>
        </min>
        <max>
          <x>798</x>
          <y>500</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>641</xMin>
        <yMin>400</yMin>
        <xMax>798</xMax>
        <yMax>500</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You speed away from this city before seeing any signs of trouble.</Text>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>823</x>
        <y>247</y>
        <position>
          <x>823</x>
          <y>247</y>
        </position>
        <center>
          <x>898</x>
          <y>297</y>
        </center>
        <min>
          <x>823</x>
          <y>247</y>
        </min>
        <max>
          <x>973</x>
          <y>347</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>823</xMin>
        <yMin>247</yMin>
        <xMax>973</xMax>
        <yMax>347</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Suddenly, you hear loud alarms ringing and several T.O.R.V.A.K. vehicles appear from nearby alleyways.

They've got you surrounded!</Text>
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
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>T_U_A_Ambush2</Name>
</Scenario>
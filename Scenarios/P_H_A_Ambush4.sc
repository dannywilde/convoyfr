﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/P_H_A_Ambush4.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>266</x>
        <y>260</y>
        <position>
          <x>266</x>
          <y>260</y>
        </position>
        <center>
          <x>383</x>
          <y>333.5</y>
        </center>
        <min>
          <x>266</x>
          <y>260</y>
        </min>
        <max>
          <x>500</x>
          <y>407</y>
        </max>
        <width>234</width>
        <height>147</height>
        <size>
          <x>234</x>
          <y>147</y>
        </size>
        <xMin>266</xMin>
        <yMin>260</yMin>
        <xMax>500</xMax>
        <yMax>407</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Your radio picks up: "Batten down the hatches, mates, it's gonna get ugly!"

It appears that several privateer vehicles were hidden besides the highway.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableWarZone">
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
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Time to fight!</Name>
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
                <x>222</x>
                <y>109</y>
                <position>
                  <x>222</x>
                  <y>109</y>
                </position>
                <center>
                  <x>227</x>
                  <y>114</y>
                </center>
                <min>
                  <x>222</x>
                  <y>109</y>
                </min>
                <max>
                  <x>232</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>222</xMin>
                <yMin>109</yMin>
                <xMax>232</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>2</ToDialog>
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
                <x>222</x>
                <y>127</y>
                <position>
                  <x>222</x>
                  <y>127</y>
                </position>
                <center>
                  <x>227</x>
                  <y>132</y>
                </center>
                <min>
                  <x>222</x>
                  <y>127</y>
                </min>
                <max>
                  <x>232</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>222</xMin>
                <yMin>127</yMin>
                <xMax>232</xMax>
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
          <Name>Supercharge engines to flee! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>371</x>
        <y>574</y>
        <position>
          <x>371</x>
          <y>574</y>
        </position>
        <center>
          <x>446</x>
          <y>624</y>
        </center>
        <min>
          <x>371</x>
          <y>574</y>
        </min>
        <max>
          <x>521</x>
          <y>674</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>371</xMin>
        <yMin>574</yMin>
        <xMax>521</xMax>
        <yMax>674</yMax>
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
        <x>657</x>
        <y>173</y>
        <position>
          <x>657</x>
          <y>173</y>
        </position>
        <center>
          <x>735.5</x>
          <y>223</y>
        </center>
        <min>
          <x>657</x>
          <y>173</y>
        </min>
        <max>
          <x>814</x>
          <y>273</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>657</xMin>
        <yMin>173</yMin>
        <xMax>814</xMax>
        <yMax>273</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your pumped up engines easily leave the privateers far behind you.</Text>
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
        <x>636</x>
        <y>405</y>
        <position>
          <x>636</x>
          <y>405</y>
        </position>
        <center>
          <x>711</x>
          <y>468.455078</y>
        </center>
        <min>
          <x>636</x>
          <y>405</y>
        </min>
        <max>
          <x>786</x>
          <y>531.910156</y>
        </max>
        <width>150</width>
        <height>126.910156</height>
        <size>
          <x>150</x>
          <y>126.910156</y>
        </size>
        <xMin>636</xMin>
        <yMin>405</yMin>
        <xMax>786</xMax>
        <yMax>531.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers supercharge their own engines and catch up your convoy, a fight is inevitable.</Text>
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Damn!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>P_H_A_Ambush4</Name>
</Scenario>
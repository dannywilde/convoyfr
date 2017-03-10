﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/P_H_A_Ambush2.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>160</x>
        <y>255</y>
        <position>
          <x>160</x>
          <y>255</y>
        </position>
        <center>
          <x>288</x>
          <y>328.5</y>
        </center>
        <min>
          <x>160</x>
          <y>255</y>
        </min>
        <max>
          <x>416</x>
          <y>402</y>
        </max>
        <width>256</width>
        <height>147</height>
        <size>
          <x>256</x>
          <y>147</y>
        </size>
        <xMin>160</xMin>
        <yMin>255</yMin>
        <xMax>416</xMax>
        <yMax>402</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Scanners pick up several vehicles chasing after your convoy on this main road.

It seems as if they are sporting guns that look remarkably like modified ancient cannons.

Privateers incoming!</Text>
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
          <Name>Ready weapons!</Name>
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
                <x>244</x>
                <y>109</y>
                <position>
                  <x>244</x>
                  <y>109</y>
                </position>
                <center>
                  <x>249</x>
                  <y>114</y>
                </center>
                <min>
                  <x>244</x>
                  <y>109</y>
                </min>
                <max>
                  <x>254</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>109</yMin>
                <xMax>254</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>3</ToDialog>
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
                <x>244</x>
                <y>127</y>
                <position>
                  <x>244</x>
                  <y>127</y>
                </position>
                <center>
                  <x>249</x>
                  <y>132</y>
                </center>
                <min>
                  <x>244</x>
                  <y>127</y>
                </min>
                <max>
                  <x>254</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>127</yMin>
                <xMax>254</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>162</x>
        <y>494</y>
        <position>
          <x>162</x>
          <y>494</y>
        </position>
        <center>
          <x>237</x>
          <y>544</y>
        </center>
        <min>
          <x>162</x>
          <y>494</y>
        </min>
        <max>
          <x>312</x>
          <y>594</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>162</xMin>
        <yMin>494</yMin>
        <xMax>312</xMax>
        <yMax>594</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>It would appear most of the modified ancient cannons didn't survive the battle.

[0loot]</Text>
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
        <x>614</x>
        <y>443</y>
        <position>
          <x>614</x>
          <y>443</y>
        </position>
        <center>
          <x>690.5</x>
          <y>493</y>
        </center>
        <min>
          <x>614</x>
          <y>443</y>
        </min>
        <max>
          <x>767</x>
          <y>543</y>
        </max>
        <width>153</width>
        <height>100</height>
        <size>
          <x>153</x>
          <y>100</y>
        </size>
        <xMin>614</xMin>
        <yMin>443</yMin>
        <xMax>767</xMax>
        <yMax>543</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You're under too much artillery fire to be able to escape without a fight!</Text>
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
          <Name>Time to fight back!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>616</x>
        <y>302</y>
        <position>
          <x>616</x>
          <y>302</y>
        </position>
        <center>
          <x>694.5</x>
          <y>352</y>
        </center>
        <min>
          <x>616</x>
          <y>302</y>
        </min>
        <max>
          <x>773</x>
          <y>402</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>616</xMin>
        <yMin>302</yMin>
        <xMax>773</xMax>
        <yMax>402</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Those modified cannons are no match for your supercharged engines, you easily escape.</Text>
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
  </Dialogs>
  <Name>P_H_A_Ambush2</Name>
</Scenario>
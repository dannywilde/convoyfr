﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/G_H_A_Under Attack.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>222</x>
        <y>274</y>
        <position>
          <x>222</x>
          <y>274</y>
        </position>
        <center>
          <x>350</x>
          <y>347.5</y>
        </center>
        <min>
          <x>222</x>
          <y>274</y>
        </min>
        <max>
          <x>478</x>
          <y>421</y>
        </max>
        <width>256</width>
        <height>147</height>
        <size>
          <x>256</x>
          <y>147</y>
        </size>
        <xMin>222</xMin>
        <yMin>274</yMin>
        <xMax>478</xMax>
        <yMax>421</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Raiders appear from hiding places along the highway and move in to engage you!

Escaping seems unlikely, you'll have to fight.</Text>
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
          <Name>Return fire!</Name>
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
              <Chance>2</Chance>
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
              <ToDialog>3</ToDialog>
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
        <x>257</x>
        <y>557</y>
        <position>
          <x>257</x>
          <y>557</y>
        </position>
        <center>
          <x>332</x>
          <y>607.5</y>
        </center>
        <min>
          <x>257</x>
          <y>557</y>
        </min>
        <max>
          <x>407</x>
          <y>658</y>
        </max>
        <width>150</width>
        <height>101</height>
        <size>
          <x>150</x>
          <y>101</y>
        </size>
        <xMin>257</xMin>
        <yMin>557</yMin>
        <xMax>407</xMax>
        <yMax>658</yMax>
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
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
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
        <x>618</x>
        <y>248</y>
        <position>
          <x>618</x>
          <y>248</y>
        </position>
        <center>
          <x>696.5</x>
          <y>311.455078</y>
        </center>
        <min>
          <x>618</x>
          <y>248</y>
        </min>
        <max>
          <x>775</x>
          <y>374.910156</y>
        </max>
        <width>157</width>
        <height>126.910156</height>
        <size>
          <x>157</x>
          <y>126.910156</y>
        </size>
        <xMin>618</xMin>
        <yMin>248</yMin>
        <xMax>775</xMax>
        <yMax>374.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite the odds, supercharging your engines proved to be enough to escape!</Text>
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
        <x>614</x>
        <y>432</y>
        <position>
          <x>614</x>
          <y>432</y>
        </position>
        <center>
          <x>689</x>
          <y>482</y>
        </center>
        <min>
          <x>614</x>
          <y>432</y>
        </min>
        <max>
          <x>764</x>
          <y>532</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>614</xMin>
        <yMin>432</yMin>
        <xMax>764</xMax>
        <yMax>532</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Sadly, not even supercharging your engines was enough to escape these raiders.

Fighting is inevitable.</Text>
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
          <Name>Open fire!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_A_Under Attack</Name>
</Scenario>
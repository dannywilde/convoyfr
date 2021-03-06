﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/R_D_A_Ambush6.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>224</x>
        <y>163</y>
        <position>
          <x>224</x>
          <y>163</y>
        </position>
        <center>
          <x>302.5</x>
          <y>236.5</y>
        </center>
        <min>
          <x>224</x>
          <y>163</y>
        </min>
        <max>
          <x>381</x>
          <y>310</y>
        </max>
        <width>157</width>
        <height>147</height>
        <size>
          <x>157</x>
          <y>147</y>
        </size>
        <xMin>224</xMin>
        <yMin>163</yMin>
        <xMax>381</xMax>
        <yMax>310</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Several raider vehicles are approaching your convoy, their presumed leader taunts you on the radio by exclaiming:

"Imma gonna DESTROY you!"</Text>
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
          <Name>Ready weapons.</Name>
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
                <x>145</x>
                <y>109</y>
                <position>
                  <x>145</x>
                  <y>109</y>
                </position>
                <center>
                  <x>150</x>
                  <y>114</y>
                </center>
                <min>
                  <x>145</x>
                  <y>109</y>
                </min>
                <max>
                  <x>155</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>109</yMin>
                <xMax>155</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
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
          <Name>Divert course.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>207</x>
        <y>460</y>
        <position>
          <x>207</x>
          <y>460</y>
        </position>
        <center>
          <x>282</x>
          <y>510</y>
        </center>
        <min>
          <x>207</x>
          <y>460</y>
        </min>
        <max>
          <x>357</x>
          <y>560</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>207</xMin>
        <yMin>460</yMin>
        <xMax>357</xMax>
        <yMax>560</yMax>
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
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>467</x>
        <y>302</y>
        <position>
          <x>467</x>
          <y>302</y>
        </position>
        <center>
          <x>565.5</x>
          <y>365.5</y>
        </center>
        <min>
          <x>467</x>
          <y>302</y>
        </min>
        <max>
          <x>664</x>
          <y>429</y>
        </max>
        <width>197</width>
        <height>127</height>
        <size>
          <x>197</x>
          <y>127</y>
        </size>
        <xMin>467</xMin>
        <yMin>302</yMin>
        <xMax>664</xMax>
        <yMax>429</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The raiders are keeping up the chase!</Text>
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
          <Name>Fight them!</Name>
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
                <x>185</x>
                <y>109</y>
                <position>
                  <x>185</x>
                  <y>109</y>
                </position>
                <center>
                  <x>190</x>
                  <y>114</y>
                </center>
                <min>
                  <x>185</x>
                  <y>109</y>
                </min>
                <max>
                  <x>195</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>185</xMin>
                <yMin>109</yMin>
                <xMax>195</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>747</x>
        <y>410</y>
        <position>
          <x>747</x>
          <y>410</y>
        </position>
        <center>
          <x>825.5</x>
          <y>460</y>
        </center>
        <min>
          <x>747</x>
          <y>410</y>
        </min>
        <max>
          <x>904</x>
          <y>510</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>747</xMin>
        <yMin>410</yMin>
        <xMax>904</xMax>
        <yMax>510</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The raiders swiftly become small dots in your rearview mirror.</Text>
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
          <Name>Keep rolling.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_D_A_Ambush6</Name>
</Scenario>
﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/projects/Convoy/Assets/StreamingAssets/Scenarios/T_U_A_NoAmbush.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-96</x>
        <y>317</y>
        <position>
          <x>-96</x>
          <y>317</y>
        </position>
        <center>
          <x>15.5</x>
          <y>380.5</y>
        </center>
        <min>
          <x>-96</x>
          <y>317</y>
        </min>
        <max>
          <x>127</x>
          <y>444</y>
        </max>
        <width>223</width>
        <height>127</height>
        <size>
          <x>223</x>
          <y>127</y>
        </size>
        <xMin>-96</xMin>
        <yMin>317</yMin>
        <xMax>127</xMax>
        <yMax>444</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>This desolate city seems eerily quiet.</Text>
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
                <y>109</y>
                <position>
                  <x>211</x>
                  <y>109</y>
                </position>
                <center>
                  <x>216</x>
                  <y>114</y>
                </center>
                <min>
                  <x>211</x>
                  <y>109</y>
                </min>
                <max>
                  <x>221</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>211</xMin>
                <yMin>109</yMin>
                <xMax>221</xMax>
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
          <Name>Supercharge out of here. [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>49</x>
        <y>648</y>
        <position>
          <x>49</x>
          <y>648</y>
        </position>
        <center>
          <x>124</x>
          <y>698</y>
        </center>
        <min>
          <x>49</x>
          <y>648</y>
        </min>
        <max>
          <x>199</x>
          <y>748</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>49</xMin>
        <yMin>648</yMin>
        <xMax>199</xMax>
        <yMax>748</yMax>
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
        <x>385</x>
        <y>244</y>
        <position>
          <x>385</x>
          <y>244</y>
        </position>
        <center>
          <x>463.5</x>
          <y>294</y>
        </center>
        <min>
          <x>385</x>
          <y>244</y>
        </min>
        <max>
          <x>542</x>
          <y>344</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>385</xMin>
        <yMin>244</yMin>
        <xMax>542</xMax>
        <yMax>344</yMax>
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
        <x>321</x>
        <y>423</y>
        <position>
          <x>321</x>
          <y>423</y>
        </position>
        <center>
          <x>399.5</x>
          <y>473</y>
        </center>
        <min>
          <x>321</x>
          <y>423</y>
        </min>
        <max>
          <x>478</x>
          <y>523</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>321</xMin>
        <yMin>423</yMin>
        <xMax>478</xMax>
        <yMax>523</yMax>
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
  </Dialogs>
  <Name>T_U_A_NoAmbush</Name>
</Scenario>
﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/T_U_S_Propoganda.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>257</x>
        <y>324</y>
        <position>
          <x>257</x>
          <y>324</y>
        </position>
        <center>
          <x>359.5</x>
          <y>406.5</y>
        </center>
        <min>
          <x>257</x>
          <y>324</y>
        </min>
        <max>
          <x>462</x>
          <y>489</y>
        </max>
        <width>205</width>
        <height>165</height>
        <size>
          <x>205</x>
          <y>165</y>
        </size>
        <xMin>257</xMin>
        <yMin>324</yMin>
        <xMax>462</xMax>
        <yMax>489</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>The signal appears to be a T.O.R.V.A.K. propoganda tower.

It promises a life of wealth and pleasure for any person who joins, directing them to seek out the nearest checkpoint.</Text>
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
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>83</y>
                <position>
                  <x>193</x>
                  <y>83</y>
                </position>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <min>
                  <x>193</x>
                  <y>83</y>
                </min>
                <max>
                  <x>203</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Destroy it.</Name>
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
                <y>127</y>
                <position>
                  <x>193</x>
                  <y>127</y>
                </position>
                <center>
                  <x>198</x>
                  <y>132</y>
                </center>
                <min>
                  <x>193</x>
                  <y>127</y>
                </min>
                <max>
                  <x>203</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>127</yMin>
                <xMax>203</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ignore it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>336</x>
        <y>723</y>
        <position>
          <x>336</x>
          <y>723</y>
        </position>
        <center>
          <x>411</x>
          <y>773</y>
        </center>
        <min>
          <x>336</x>
          <y>723</y>
        </min>
        <max>
          <x>486</x>
          <y>823</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>336</xMin>
        <yMin>723</yMin>
        <xMax>486</xMax>
        <yMax>823</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>It turns out the propoganda didn't help those T.O.R.V.A.K. vehicles defeat you.

[0loot]

You easily blow up the propoganda tower.</Text>
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
          <Name>Roll out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>486</x>
        <y>463</y>
        <position>
          <x>486</x>
          <y>463</y>
        </position>
        <center>
          <x>564.5</x>
          <y>513</y>
        </center>
        <min>
          <x>486</x>
          <y>463</y>
        </min>
        <max>
          <x>643</x>
          <y>563</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>486</xMin>
        <yMin>463</yMin>
        <xMax>643</xMax>
        <yMax>563</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The last thing you need is T.O.R.V.A.K. lies.</Text>
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
          <Name>Roll out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>545</x>
        <y>305</y>
        <position>
          <x>545</x>
          <y>305</y>
        </position>
        <center>
          <x>623.5</x>
          <y>355</y>
        </center>
        <min>
          <x>545</x>
          <y>305</y>
        </min>
        <max>
          <x>702</x>
          <y>405</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>545</xMin>
        <yMin>305</yMin>
        <xMax>702</xMax>
        <yMax>405</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>All the propoganda inspires you to fire a little faster, the tower is easily destroyed.</Text>
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
          <Name>Roll out.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>569</x>
        <y>130</y>
        <position>
          <x>569</x>
          <y>130</y>
        </position>
        <center>
          <x>644</x>
          <y>180</y>
        </center>
        <min>
          <x>569</x>
          <y>130</y>
        </min>
        <max>
          <x>719</x>
          <y>230</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>569</xMin>
        <yMin>130</yMin>
        <xMax>719</xMax>
        <yMax>230</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you move to blow up the tower, several T.O.R.V.A.K. vehicles approach from nearby streets.

"We shall not tolerate the destruction of T.O.R.V.A.K. material."</Text>
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
  <Name>T_U_S_Propoganda</Name>
</Scenario>
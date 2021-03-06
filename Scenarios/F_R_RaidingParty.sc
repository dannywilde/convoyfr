﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/F_R_RaidingParty.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>127</x>
        <y>271</y>
        <position>
          <x>127</x>
          <y>271</y>
        </position>
        <center>
          <x>229.5</x>
          <y>331.5</y>
        </center>
        <min>
          <x>127</x>
          <y>271</y>
        </min>
        <max>
          <x>332</x>
          <y>392</y>
        </max>
        <width>205</width>
        <height>121</height>
        <size>
          <x>205</x>
          <y>121</y>
        </size>
        <xMin>127</xMin>
        <yMin>271</yMin>
        <xMax>332</xMax>
        <yMax>392</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You've broadcasted your emergency signal for some time, when you see thick black smoke billowing in the distance.
</Text>
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
              <Chance>4</Chance>
              <ToDialog>2</ToDialog>
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
              <amount>3</amount>
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
                <y>101</y>
                <position>
                  <x>193</x>
                  <y>101</y>
                </position>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <min>
                  <x>193</x>
                  <y>101</y>
                </min>
                <max>
                  <x>203</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>0</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>9999</AmountAP>
              <AmountHP>9999</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Oh dear...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>156</x>
        <y>577</y>
        <position>
          <x>156</x>
          <y>577</y>
        </position>
        <center>
          <x>232</x>
          <y>646.5</y>
        </center>
        <min>
          <x>156</x>
          <y>577</y>
        </min>
        <max>
          <x>308</x>
          <y>716</y>
        </max>
        <width>152</width>
        <height>139</height>
        <size>
          <x>152</x>
          <y>139</y>
        </size>
        <xMin>156</xMin>
        <yMin>577</yMin>
        <xMax>308</xMax>
        <yMax>716</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Evidently, you had just enough fuel to fight off the raiders.

Upon searching through the wrecks, you manage to recover [0#]. You hardly have time to look for parts, so you only manage to acquire [0$].

You should be able to continue your way now.</Text>
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
              <Amount>26</Amount>
              <fuelAmount>16</fuelAmount>
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
              <Amount>15</Amount>
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
              <Amount>23</Amount>
              <fuelAmount>13</fuelAmount>
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
              <Amount>19</Amount>
              <fuelAmount>18</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>473</x>
        <y>141</y>
        <position>
          <x>473</x>
          <y>141</y>
        </position>
        <center>
          <x>550</x>
          <y>191</y>
        </center>
        <min>
          <x>473</x>
          <y>141</y>
        </min>
        <max>
          <x>627</x>
          <y>241</y>
        </max>
        <width>154</width>
        <height>100</height>
        <size>
          <x>154</x>
          <y>100</y>
        </size>
        <xMin>473</xMin>
        <yMin>141</yMin>
        <xMax>627</xMax>
        <yMax>241</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>A group of raiders picked up on your signal and are here for some easy prey..

You hope you can squeeze some final fuel out of your vehicles to fight them off.</Text>
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
          <Name>Fingers crossed....</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>535</x>
        <y>293</y>
        <position>
          <x>535</x>
          <y>293</y>
        </position>
        <center>
          <x>613.5</x>
          <y>343</y>
        </center>
        <min>
          <x>535</x>
          <y>293</y>
        </min>
        <max>
          <x>692</x>
          <y>393</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>535</xMin>
        <yMin>293</yMin>
        <xMax>692</xMax>
        <yMax>393</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to fend them off, but not without suffering damage.</Text>
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
        <x>494</x>
        <y>444</y>
        <position>
          <x>494</x>
          <y>444</y>
        </position>
        <center>
          <x>572.5</x>
          <y>494</y>
        </center>
        <min>
          <x>494</x>
          <y>444</y>
        </min>
        <max>
          <x>651</x>
          <y>544</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>494</xMin>
        <yMin>444</yMin>
        <xMax>651</xMax>
        <yMax>544</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You've managed to fend off the raiders, who are now in full retreat.

It didn't come cheap, though.</Text>
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
  <Name>F_R_RaidingParty</Name>
</Scenario>
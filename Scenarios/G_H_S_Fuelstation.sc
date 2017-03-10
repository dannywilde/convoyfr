﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/ObjectiveScenarios/G_H_S_Fuelstation.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>374</x>
        <y>295</y>
        <position>
          <x>374</x>
          <y>295</y>
        </position>
        <center>
          <x>476.5</x>
          <y>377.5</y>
        </center>
        <min>
          <x>374</x>
          <y>295</y>
        </min>
        <max>
          <x>579</x>
          <y>460</y>
        </max>
        <width>205</width>
        <height>165</height>
        <size>
          <x>205</x>
          <y>165</y>
        </size>
        <xMin>374</xMin>
        <yMin>295</yMin>
        <xMax>579</xMax>
        <yMax>460</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>It looks like an old abandoned service station has left its advertising signal on repeat.

That, or it's an ambush. Considering this planet the latter is probably true.</Text>
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
            <ButtonAction xsi:type="NextDialog">
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
              <Chance>3</Chance>
              <ToDialog>3</ToDialog>
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
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Check it out.</Name>
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
          <Name>Ignore it and continue.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>429</x>
        <y>643</y>
        <position>
          <x>429</x>
          <y>643</y>
        </position>
        <center>
          <x>507</x>
          <y>693.5</y>
        </center>
        <min>
          <x>429</x>
          <y>643</y>
        </min>
        <max>
          <x>585</x>
          <y>744</y>
        </max>
        <width>156</width>
        <height>101</height>
        <size>
          <x>156</x>
          <y>101</y>
        </size>
        <xMin>429</xMin>
        <yMin>643</yMin>
        <xMax>585</xMax>
        <yMax>744</yMax>
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
                <x>144</x>
                <y>65</y>
                <position>
                  <x>144</x>
                  <y>65</y>
                </position>
                <center>
                  <x>149</x>
                  <y>70</y>
                </center>
                <min>
                  <x>144</x>
                  <y>65</y>
                </min>
                <max>
                  <x>154</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>144</xMin>
                <yMin>65</yMin>
                <xMax>154</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
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
                <x>144</x>
                <y>83</y>
                <position>
                  <x>144</x>
                  <y>83</y>
                </position>
                <center>
                  <x>149</x>
                  <y>88</y>
                </center>
                <min>
                  <x>144</x>
                  <y>83</y>
                </min>
                <max>
                  <x>154</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>144</xMin>
                <yMin>83</yMin>
                <xMax>154</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Inspect the station.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>832</x>
        <y>90</y>
        <position>
          <x>832</x>
          <y>90</y>
        </position>
        <center>
          <x>908</x>
          <y>159.5</y>
        </center>
        <min>
          <x>832</x>
          <y>90</y>
        </min>
        <max>
          <x>984</x>
          <y>229</y>
        </max>
        <width>152</width>
        <height>139</height>
        <size>
          <x>152</x>
          <y>139</y>
        </size>
        <xMin>832</xMin>
        <yMin>90</yMin>
        <xMax>984</xMax>
        <yMax>229</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon approaching the service station, you don't seem to spot any approaching vehicles nor hear any gunfire.

Looks like it's really just an abandoned fuel station.

Upon closer inspection, you manage to find some fuel reserves which total [0#]!</Text>
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
              <Amount>0</Amount>
              <fuelAmount>10</fuelAmount>
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
              <Amount>0</Amount>
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
              <Amount>0</Amount>
              <fuelAmount>20</fuelAmount>
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
              <Amount>0</Amount>
              <fuelAmount>25</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>835</x>
        <y>264</y>
        <position>
          <x>835</x>
          <y>264</y>
        </position>
        <center>
          <x>910</x>
          <y>314</y>
        </center>
        <min>
          <x>835</x>
          <y>264</y>
        </min>
        <max>
          <x>985</x>
          <y>364</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>835</xMin>
        <yMin>264</yMin>
        <xMax>985</xMax>
        <yMax>364</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As expected, the service station signal was being used to ambush travellers.

Since you saw it coming, they don't manage to get the drop on you.</Text>
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
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>831</x>
        <y>409</y>
        <position>
          <x>831</x>
          <y>409</y>
        </position>
        <center>
          <x>909.5</x>
          <y>459</y>
        </center>
        <min>
          <x>831</x>
          <y>409</y>
        </min>
        <max>
          <x>988</x>
          <y>509</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>831</xMin>
        <yMin>409</yMin>
        <xMax>988</xMax>
        <yMax>509</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon approaching the service station, you don't seem to spot any approaching vehicles nor hear any gunfire.

Looks like it's really just an abandoned fuel station. Not without reason, as you don't find any remaining fuel or anything of worth.
</Text>
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
          <Name>Damn... continue.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>728</x>
        <y>567</y>
        <position>
          <x>728</x>
          <y>567</y>
        </position>
        <center>
          <x>804</x>
          <y>635.5</y>
        </center>
        <min>
          <x>728</x>
          <y>567</y>
        </min>
        <max>
          <x>880</x>
          <y>704</y>
        </max>
        <width>152</width>
        <height>137</height>
        <size>
          <x>152</x>
          <y>137</y>
        </size>
        <xMin>728</xMin>
        <yMin>567</yMin>
        <xMax>880</xMax>
        <yMax>704</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After disabling the broadcasting signal you thoroughly search the service station and manage to acquire [0#].</Text>
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
              <Amount>10</Amount>
              <fuelAmount>0</fuelAmount>
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
              <Amount>13</Amount>
              <fuelAmount>0</fuelAmount>
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
              <Amount>17</Amount>
              <fuelAmount>0</fuelAmount>
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
              <Amount>20</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>730</x>
        <y>743</y>
        <position>
          <x>730</x>
          <y>743</y>
        </position>
        <center>
          <x>808.5</x>
          <y>793</y>
        </center>
        <min>
          <x>730</x>
          <y>743</y>
        </min>
        <max>
          <x>887</x>
          <y>843</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>730</xMin>
        <yMin>743</yMin>
        <xMax>887</xMax>
        <yMax>843</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You don't manage to find anything of worth, but you do decide to disable the broadcasting signal.</Text>
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
          <Name>Onwards.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_S_Fuelstation</Name>
</Scenario>
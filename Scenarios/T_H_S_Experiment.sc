﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/T_H_S_Experiment.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-178</x>
        <y>377</y>
        <position>
          <x>-178</x>
          <y>377</y>
        </position>
        <center>
          <x>-65</x>
          <y>443.1328</y>
        </center>
        <min>
          <x>-178</x>
          <y>377</y>
        </min>
        <max>
          <x>48</x>
          <y>509.265625</y>
        </max>
        <width>226</width>
        <height>132.265625</height>
        <size>
          <x>226</x>
          <y>132.265625</y>
        </size>
        <xMin>-178</xMin>
        <yMin>377</yMin>
        <xMax>48</xMax>
        <yMax>509.265625</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>A T.O.R.V.A.K. facility hails your convoy.</Text>
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
                <x>214</x>
                <y>65</y>
                <position>
                  <x>214</x>
                  <y>65</y>
                </position>
                <center>
                  <x>219</x>
                  <y>70</y>
                </center>
                <min>
                  <x>214</x>
                  <y>65</y>
                </min>
                <max>
                  <x>224</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>214</xMin>
                <yMin>65</yMin>
                <xMax>224</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Let's hear it.</Name>
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
          <Name>They can't be trusted, leave.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-161</x>
        <y>671</y>
        <position>
          <x>-161</x>
          <y>671</y>
        </position>
        <center>
          <x>-86</x>
          <y>721</y>
        </center>
        <min>
          <x>-161</x>
          <y>671</y>
        </min>
        <max>
          <x>-11</x>
          <y>771</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>-161</xMin>
        <yMin>671</yMin>
        <xMax>-11</xMax>
        <yMax>771</yMax>
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
        <x>146</x>
        <y>334</y>
        <position>
          <x>146</x>
          <y>334</y>
        </position>
        <center>
          <x>227.5</x>
          <y>419.265625</y>
        </center>
        <min>
          <x>146</x>
          <y>334</y>
        </min>
        <max>
          <x>309</x>
          <y>504.53125</y>
        </max>
        <width>163</width>
        <height>170.53125</height>
        <size>
          <x>163</x>
          <y>170.53125</y>
        </size>
        <xMin>146</xMin>
        <yMin>334</yMin>
        <xMax>309</xMax>
        <yMax>504.53125</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We are conducting an experiment to make vehicles more resilient.

We wish to experiment on one of your vehicles."</Text>
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
                <x>151</x>
                <y>65</y>
                <position>
                  <x>151</x>
                  <y>65</y>
                </position>
                <center>
                  <x>156</x>
                  <y>70</y>
                </center>
                <min>
                  <x>151</x>
                  <y>65</y>
                </min>
                <max>
                  <x>161</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>151</xMin>
                <yMin>65</yMin>
                <xMax>161</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
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
                <x>151</x>
                <y>83</y>
                <position>
                  <x>151</x>
                  <y>83</y>
                </position>
                <center>
                  <x>156</x>
                  <y>88</y>
                </center>
                <min>
                  <x>151</x>
                  <y>83</y>
                </min>
                <max>
                  <x>161</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>151</xMin>
                <yMin>83</yMin>
                <xMax>161</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Very well.</Name>
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
                <x>151</x>
                <y>127</y>
                <position>
                  <x>151</x>
                  <y>127</y>
                </position>
                <center>
                  <x>156</x>
                  <y>132</y>
                </center>
                <min>
                  <x>151</x>
                  <y>127</y>
                </min>
                <max>
                  <x>161</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>151</xMin>
                <yMin>127</yMin>
                <xMax>161</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
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
          <Name>No chance.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>390</x>
        <y>199</y>
        <position>
          <x>390</x>
          <y>199</y>
        </position>
        <center>
          <x>471.5</x>
          <y>281.5</y>
        </center>
        <min>
          <x>390</x>
          <y>199</y>
        </min>
        <max>
          <x>553</x>
          <y>364</y>
        </max>
        <width>163</width>
        <height>165</height>
        <size>
          <x>163</x>
          <y>165</y>
        </size>
        <xMin>390</xMin>
        <yMin>199</yMin>
        <xMax>553</xMax>
        <yMax>364</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>They install some sort of shield generator on your vehicle and fire a variety of weapons at it.

After some time, the vehicle remains unharmed.

"We thank you for your cooperation. You may keep the shield generator as a token of our appreciation."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddItem">
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
              <Chance>5</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <ItemNumber>17</ItemNumber>
            </ButtonAction>
            <ButtonAction xsi:type="AddItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>151</x>
                <y>83</y>
                <position>
                  <x>151</x>
                  <y>83</y>
                </position>
                <center>
                  <x>156</x>
                  <y>88</y>
                </center>
                <min>
                  <x>151</x>
                  <y>83</y>
                </min>
                <max>
                  <x>161</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>151</xMin>
                <yMin>83</yMin>
                <xMax>161</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <ItemNumber>18</ItemNumber>
            </ButtonAction>
            <ButtonAction xsi:type="AddItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>151</x>
                <y>101</y>
                <position>
                  <x>151</x>
                  <y>101</y>
                </position>
                <center>
                  <x>156</x>
                  <y>106</y>
                </center>
                <min>
                  <x>151</x>
                  <y>101</y>
                </min>
                <max>
                  <x>161</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>151</xMin>
                <yMin>101</yMin>
                <xMax>161</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <ItemNumber>37</ItemNumber>
            </ButtonAction>
          </Actions>
          <Name>Sweet!</Name>
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
          <Name>Not interested.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>395</x>
        <y>386</y>
        <position>
          <x>395</x>
          <y>386</y>
        </position>
        <center>
          <x>473.5</x>
          <y>438.6328</y>
        </center>
        <min>
          <x>395</x>
          <y>386</y>
        </min>
        <max>
          <x>552</x>
          <y>491.265625</y>
        </max>
        <width>157</width>
        <height>105.265625</height>
        <size>
          <x>157</x>
          <y>105.265625</y>
        </size>
        <xMin>395</xMin>
        <yMin>386</yMin>
        <xMax>552</xMax>
        <yMax>491.265625</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>They install a device on your vehicle and proceed with their experiment.

After some time, your vehicle is surrounded by arcs of lighting striking out at random.
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
                <x>145</x>
                <y>65</y>
                <position>
                  <x>145</x>
                  <y>65</y>
                </position>
                <center>
                  <x>150</x>
                  <y>70</y>
                </center>
                <min>
                  <x>145</x>
                  <y>65</y>
                </min>
                <max>
                  <x>155</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>65</yMin>
                <xMax>155</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>6</ToDialog>
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
                <x>145</x>
                <y>83</y>
                <position>
                  <x>145</x>
                  <y>83</y>
                </position>
                <center>
                  <x>150</x>
                  <y>88</y>
                </center>
                <min>
                  <x>145</x>
                  <y>83</y>
                </min>
                <max>
                  <x>155</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>83</yMin>
                <xMax>155</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ok...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>395</x>
        <y>559</y>
        <position>
          <x>395</x>
          <y>559</y>
        </position>
        <center>
          <x>473.5</x>
          <y>609</y>
        </center>
        <min>
          <x>395</x>
          <y>559</y>
        </min>
        <max>
          <x>552</x>
          <y>659</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>395</xMin>
        <yMin>559</yMin>
        <xMax>552</xMax>
        <yMax>659</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Then we shall experiment on your vehicles by force!"</Text>
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
          <Name>Prepare to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>648</x>
        <y>248</y>
        <position>
          <x>648</x>
          <y>248</y>
        </position>
        <center>
          <x>731</x>
          <y>319.765625</y>
        </center>
        <min>
          <x>648</x>
          <y>248</y>
        </min>
        <max>
          <x>814</x>
          <y>391.53125</y>
        </max>
        <width>166</width>
        <height>143.53125</height>
        <size>
          <x>166</x>
          <y>143.53125</y>
        </size>
        <xMin>648</xMin>
        <yMin>248</yMin>
        <xMax>814</xMax>
        <yMax>391.53125</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After some time, the lightning dissipates and your vehicle appears unharmed.

"We thank you for your cooperation.

We shall reward you with [0$]"</Text>
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
                <x>154</x>
                <y>65</y>
                <position>
                  <x>154</x>
                  <y>65</y>
                </position>
                <center>
                  <x>159</x>
                  <y>70</y>
                </center>
                <min>
                  <x>154</x>
                  <y>65</y>
                </min>
                <max>
                  <x>164</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>65</yMin>
                <xMax>164</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>80</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>154</x>
                <y>83</y>
                <position>
                  <x>154</x>
                  <y>83</y>
                </position>
                <center>
                  <x>159</x>
                  <y>88</y>
                </center>
                <min>
                  <x>154</x>
                  <y>83</y>
                </min>
                <max>
                  <x>164</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>83</yMin>
                <xMax>164</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>90</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>154</x>
                <y>101</y>
                <position>
                  <x>154</x>
                  <y>101</y>
                </position>
                <center>
                  <x>159</x>
                  <y>106</y>
                </center>
                <min>
                  <x>154</x>
                  <y>101</y>
                </min>
                <max>
                  <x>164</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>101</yMin>
                <xMax>164</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>110</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>154</x>
                <y>119</y>
                <position>
                  <x>154</x>
                  <y>119</y>
                </position>
                <center>
                  <x>159</x>
                  <y>124</y>
                </center>
                <min>
                  <x>154</x>
                  <y>119</y>
                </min>
                <max>
                  <x>164</x>
                  <y>129</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>154</xMin>
                <yMin>119</yMin>
                <xMax>164</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>120</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Thanks!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>613</x>
        <y>459</y>
        <position>
          <x>613</x>
          <y>459</y>
        </position>
        <center>
          <x>720</x>
          <y>510.5</y>
        </center>
        <min>
          <x>613</x>
          <y>459</y>
        </min>
        <max>
          <x>827</x>
          <y>562</y>
        </max>
        <width>214</width>
        <height>103</height>
        <size>
          <x>214</x>
          <y>103</y>
        </size>
        <xMin>613</xMin>
        <yMin>459</yMin>
        <xMax>827</xMax>
        <yMax>562</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Unforseen complications!

Power overwhelming!

POWER OVERWHELMING!"

Your vehicle starts exploding! Hopefully it'll still run.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>65</y>
                <position>
                  <x>202</x>
                  <y>65</y>
                </position>
                <center>
                  <x>207</x>
                  <y>70</y>
                </center>
                <min>
                  <x>202</x>
                  <y>65</y>
                </min>
                <max>
                  <x>212</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>65</yMin>
                <xMax>212</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>100</AmountAP>
              <AmountHP>1000</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>83</y>
                <position>
                  <x>202</x>
                  <y>83</y>
                </position>
                <center>
                  <x>207</x>
                  <y>88</y>
                </center>
                <min>
                  <x>202</x>
                  <y>83</y>
                </min>
                <max>
                  <x>212</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>83</yMin>
                <xMax>212</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>2</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Damn!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>923</x>
        <y>473</y>
        <position>
          <x>923</x>
          <y>473</y>
        </position>
        <center>
          <x>1055.5</x>
          <y>539.1328</y>
        </center>
        <min>
          <x>923</x>
          <y>473</y>
        </min>
        <max>
          <x>1188</x>
          <y>605.2656</y>
        </max>
        <width>265</width>
        <height>132.265625</height>
        <size>
          <x>265</x>
          <y>132.265625</y>
        </size>
        <xMin>923</xMin>
        <yMin>473</yMin>
        <xMax>1188</xMax>
        <yMax>605.2656</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Experimentation comes at a risk.

We thank you for your cooperation.

Goodbye."</Text>
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
          <Name>Bastards, attack them!</Name>
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
          <Name>Damn T.O.R.V.A.K.... leave this place.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>T_H_S_Experiment</Name>
</Scenario>
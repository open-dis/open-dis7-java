package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@91c4a3f
 * Country: Other
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 24726
 */
public class GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor extends EntityType
{
    public GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 24723, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)13); // uid 24726, Generic Medium Helicopter, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
}

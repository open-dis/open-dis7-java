package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c1e23ff;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24727
 */
public class GenericMediumHelicopterCoaxialRotor extends EntityType
{
    /** Default constructor */
    public GenericMediumHelicopterCoaxialRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 24723, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)22); // uid 24727, Generic Medium Helicopter, Coaxial Rotor
    }
}

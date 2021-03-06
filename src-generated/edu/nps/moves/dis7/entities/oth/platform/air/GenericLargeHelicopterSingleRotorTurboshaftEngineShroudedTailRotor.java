package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@56bc3fac;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24731
 */
public class GenericLargeHelicopterSingleRotorTurboshaftEngineShroudedTailRotor extends EntityType
{
    /** Default constructor */
    public GenericLargeHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 24729, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)13); // uid 24731, Generic Large Helicopter, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
}

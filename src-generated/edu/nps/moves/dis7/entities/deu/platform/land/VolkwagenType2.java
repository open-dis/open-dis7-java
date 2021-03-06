package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21d03963;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32057
 */
public class VolkwagenType2 extends EntityType
{
    /** Default constructor */
    public VolkwagenType2()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 32055, Single Unit Cargo Truck
        setSubCategory((byte)70); // uid 32056, Van
        setSpecific((byte)1); // uid 32057, Volkwagen Type 2
    }
}

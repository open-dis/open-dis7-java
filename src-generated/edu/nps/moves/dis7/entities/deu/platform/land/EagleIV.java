package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@626abbd0;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22751
 */
public class EagleIV extends EntityType
{
    /** Default constructor */
    public EagleIV()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 16263, Armored Utility Vehicle
        setSubCategory((byte)12); // uid 22750, MOWAG Eagle armoured infantry mobility vehicle
        setSpecific((byte)1); // uid 22751, Eagle IV
    }
}

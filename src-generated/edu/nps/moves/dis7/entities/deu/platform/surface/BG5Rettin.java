package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f7923a5;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16683
 */
public class BG5Rettin extends EntityType
{
    /** Default constructor */
    public BG5Rettin()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16659, Auxiliary, Merchant Marine
        setSubCategory((byte)4); // uid 16682, Icebreaking tug (type 724; Coast Guard vessels)
        setSpecific((byte)1); // uid 16683, BG 5 Rettin
    }
}

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@706eab5d
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 14550
 */
public class KapitanMIzmaylov extends EntityType
{
    public KapitanMIzmaylov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)11); // uid 14549, Kapitan Izmaylov class (ice breakers)
        setSpecific((byte)1); // uid 14550, Kapitan M. Izmaylov
    }
}

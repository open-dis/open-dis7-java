package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a677343;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32585
 */
public class EsvagtStavanger extends EntityType
{
    /** Default constructor */
    public EsvagtStavanger()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 32582, Support Vessel
        setSubCategory((byte)9); // uid 32583, Emergency Response and Rescue Vessel (ERRV)
        setSpecific((byte)2); // uid 32585, Esvagt Stavanger
    }
}

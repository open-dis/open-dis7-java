package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@47db5fa5
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18409
 */
public class MTM546 extends EntityType
{
    public MTM546()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)10); // uid 18404, Ex-Us LCM
        setSpecific((byte)5); // uid 18409, MTM 546
    }
}

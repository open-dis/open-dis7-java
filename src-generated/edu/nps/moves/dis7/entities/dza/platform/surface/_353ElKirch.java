package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fa77460;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27047
 */
public class _353ElKirch extends EntityType
{
    /** Default constructor */
    public _353ElKirch()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27039, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 27044, Djebel Chenoua (C 58) class
        setSpecific((byte)3); // uid 27047, 353 El Kirch
    }
}

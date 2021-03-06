package edu.nps.moves.dis7.entities.fin.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3d34d211;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27910
 */
public class XA188Command extends EntityType
{
    /** Default constructor */
    public XA188Command()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27629, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 27909, Patria XA-188 GVV
        setSpecific((byte)1); // uid 27910, XA-188 Command
    }
}

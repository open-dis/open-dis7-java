package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f375618;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24390
 */
public class ASTROSResupplyAVRMD extends EntityType
{
    /** Default constructor */
    public ASTROSResupplyAVRMD()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 24388, Large Wheeled Utility Vehicle - (greater than 1.25 tons)
        setSubCategory((byte)1); // uid 24389, Tectran Enginharia
        setSpecific((byte)1); // uid 24390, ASTROS Resupply AV-RMD
    }
}
